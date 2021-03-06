/**
 * WhereCondition.java
 * Copyright (C) 2013 su.zhang, All rights reserved.
 */
package org.bronsp.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;

/**
 * <p>
 * ClassName: WhereCondition
 * </p>
 * <p>
 * Description: 组织sql查询语句的where条件
 * </p>
 * <p>
 * Date: 2013年11月9日
 * </p>
 */
public class WhereCondition {
	
	private static final long serialVersionUID = 1L;

	private StringBuffer sb;
	protected String orderBy;
	protected String groupBy;
	private int offset = 0;
	private int length = 0;
	private List<Condition> list;
	private List<List<Condition>> arrayList;
	private String globalFilter;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	private static String url = "oracle" ;
//	private static String url = "";
	
	private ServletConfig config;
	
	private static final Logger logger = LoggerFactory.getLogger(WhereCondition.class);
	
	public void init() throws ServletException {
//		super.init(config);
	   String temp = config.getServletContext().getInitParameter("url").split(":")[1]; 
	   if( StringUtils.isNotEmpty(temp) ){
		   url = temp ; 
	   }else{
		    url = "oralce" ; //默认为oracle
	   }
	   logger.info("data ：" + url);
	}

	public WhereCondition() {
//		if( StringUtils.isEmpty(url) ){
//			init();
//		}
		list = new ArrayList<Condition>();
		arrayList = new ArrayList<List<Condition>>();
		arrayList.add(list);
	}

	public static String convertStreamToString(InputStream is)
			throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		String line = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(is,
				"ISO-8859-1"));
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return new String(sb.toString().getBytes("ISO-8859-1"), "UTF-8");
	}

	public WhereCondition(String globalFilter) {
		list = new ArrayList<Condition>();
		arrayList = new ArrayList<List<Condition>>();
		arrayList.add(list);
		this.globalFilter = globalFilter;
	}

	private boolean isEmpty(String field, Object value) {
		if (value != null && value instanceof List) {
			List l = (List) value;
			if (l.size() < 1) {
				return true;
			}
		}
		if (field == null || "".equals(field) || value == null
				|| "".equals(value))
			return true;
		return false;
	}

	private boolean isEmpty(String field) {
		if (field == null || "".equals(field))
			return true;
		return false;
	}

	public void clear() {
		list.clear();
		arrayList.clear();
		arrayList.add(list);
	}

	private Condition con = null;

	/**
	 * <p>
	 * Description: 删除条件
	 * </p>
	 * 
	 * @param field
	 *            条件名称
	 */
	public void remove(String field) {
		if (isEmpty(field))
			return;
		for (int i = 0, size = list.size(); i < size; i++) {
			con = list.get(i);
			if (con.getField().equals(field)) {
				list.remove(con);
				break;
			}
		}
	}

	/**
	 * <p>
	 * Description: 添加条件
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param clause
	 *            判断字符
	 * @param value
	 *            值
	 * @param isField
	 *            value是否是字段值
	 */
	private void addCondition(String field, Object value, String clause,
			boolean isField) {
		if (isEmpty(field, value))
			return;
		con = new Condition(field, value, clause, isField);
		list.add(con);
	}

	private void appendLike(String clause, String value, boolean isField) {
		if (clause.equals("full like")) {
			sb.append(" like '%").append(value).append("%' ");
		} else if (clause.equals("left like")) {
			sb.append(" like '%").append(value).append("' ");
		} else if (clause.equals("right like")) {
			sb.append(" like '").append(value).append("%' ");
		} else if (clause.equals("in")) {
			sb.append(" in ('").append(value).append("') ");
		} else {
			if ("".equals(value)) {
				sb.append(" ").append(clause).append(" ");
			} else {
				if (isField) {
					sb.append(" ").append(clause).append(value).append(" ");
				} else {
					sb.append(" ").append(clause).append("'").append(value)
							.append("' ");
				}
			}
		}
	}

	/**
	 * <p>
	 * Description: 增加or查询
	 * </p>
	 * 
	 * @return
	 */
	public WhereCondition or() {
		list = new ArrayList<Condition>();
		arrayList.add(list);
		return this;
	}

	private void generateCondition(List<Condition> list) {
		String clause = null;
		Object value = null;
		for (int i = 0, size = list.size(); i < size; i++) {
			con = list.get(i);
			sb.append("and ").append(con.getField());
			clause = con.getClause();
			value = con.getValue();
			if (value instanceof String) {
				this.appendLike(clause, (String) value, con.getIsField());
			} else if ((StringUtils.equals(clause, "in") || StringUtils.equals(
					clause, "not in")) && value instanceof List) {
				List l = (List) value;
				if (!CollectionUtils.isEmpty(l)) {
					StringBuffer tmpSb = new StringBuffer();
					tmpSb.append("(");
					for (int k = 0; k < l.size(); k++) {
						String v = l.get(k).toString();
						tmpSb.append("'").append(v).append("'");
						if (k != l.size() - 1) {
							tmpSb.append(",");
						}
					}
					tmpSb.append(")");
					sb.append(" ").append(clause).append(tmpSb.toString())
							.append(" ");
				}
			} else if (value instanceof Date) {
				sb.append(" ").append(clause).append(" '")
						.append(sdf.format((Date) value))
						.append("' ");
			} else {
				sb.append(" ").append(clause).append(value).append(" ");
			}
		}
	}

	/**
	 * <p>
	 * Description: 获取where拼接字符串
	 * </p>
	 * 
	 * @return String
	 */
	public String getCondition() {
		sb = new StringBuffer();
		int size = arrayList.size();
		if (size == 0) {
			list = new ArrayList<Condition>();
			con = new Condition("id", "", "is not null", false);
			list.add(con);
			arrayList.add(list);
		}
		size = arrayList.size();
		if (size == 1) {
			generateCondition(list);
			if (StringUtils.isNotEmpty(globalFilter)) {
				sb.append(" ").append(globalFilter);// XXX 只处理AND情况
			}
		} else {
			for (int i = 0; i < size; i++) {
				generateCondition(arrayList.get(i));
				if (StringUtils.isNotEmpty(globalFilter)) {
					sb.append(" ").append(globalFilter);
				}
				if (i != size - 1
						&& CollectionUtils.isNotEmpty(arrayList.get(i + 1))) {
					sb.append(" or ");
				}
			}
		}
		return sb.length() > 0 ? sb.toString().replace("or and", "or") : null;
	}

	/**
	 * <p>
	 * Description: is null条件
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @return
	 */
	public WhereCondition andIsNull(String field) {
		if (field == null || "".equals(field))
			return this;
		con = new Condition(field, "", "is null", false);
		list.add(con);
		return this;
	}

	/**
	 * <p>
	 * Description: is not null条件
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @return
	 */
	public WhereCondition andIsNotNull(String field) {
		if (field == null || "".equals(field))
			return this;
		// addCondition(field, "", "is not null", false);
		con = new Condition(field, "", "is not null", false);
		list.add(con);
		return this;
	}

	/**
	 * <p>
	 * Description: 等于（=）
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 */
	public WhereCondition andEquals(String field, Object value) {
		addCondition(field, value, "=", false);
		return this;
	}

	/**
	 * <p>
	 * Description: 不等于（<>）
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 */
	public WhereCondition andNotEquals(String field, Object value) {
		addCondition(field, value, "<>", false);
		return this;
	}

	/**
	 * <p>
	 * Description: 大于（>）
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 */
	public WhereCondition andGreaterThan(String field, Object value) {
		addCondition(field, value, ">", false);
		return this;
	}

	/**
	 * <p>
	 * Description: 大于（>）
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @param isField
	 *            value是否是字段值
	 * @return
	 */
	public WhereCondition andGreaterThan(String field, Object value,
			boolean isField) {
		addCondition(field, value, ">", isField);
		return this;
	}

	/**
	 * <p>
	 * Description: 大于等于（>=）
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 */
	public WhereCondition andGreaterEquals(String field, Object value) {
		addCondition(field, value, ">=", false);
		return this;
	}

	/**
	 * <p>
	 * Description: 小于（<）
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 */
	public WhereCondition andLessThan(String field, Object value) {
		addCondition(field, value, "<", false);
		return this;
	}

	/**
	 * <p>
	 * Description: 小于（<）
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @param isField
	 *            value是否是字段值
	 * @return
	 */
	public WhereCondition andLessThan(String field, Object value,
			boolean isField) {
		addCondition(field, value, "<", isField);
		return this;
	}

	/**
	 * <p>
	 * Description: 小于等于于（<=）
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 */
	public WhereCondition andLessEquals(String field, Object value) {
		addCondition(field, value, "<=", false);
		return this;
	}

	/**
	 * <p>
	 * Description: 全匹配
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 */
	public WhereCondition andFullLike(String field, Object value) {
		addCondition(field, value, "full like", false);
		return this;
	}

	/**
	 * <p>
	 * Description: 左匹配
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 */
	public WhereCondition andLeftLike(String field, Object value) {
		addCondition(field, value, "left like", false);
		return this;
	}

	/**
	 * <p>
	 * Description: 右匹配
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 */
	public WhereCondition andRightLike(String field, Object value) {
		addCondition(field, value, "right like", false);
		return this;
	}

	/**
	 * <p>
	 * Description: in条件
	 * </p>
	 * 
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 */
	public WhereCondition andIn(String field, Object value) {
		addCondition(field, value, "in", false);
		return this;
	}

	public WhereCondition andNotIn(String field, Object value) {
		addCondition(field, value, "not in", false);
		return this;
	}
	
	private String andStartWith;
	
	public String getAndStartWith(){
		return andStartWith;
	}
	public void setAndStartWith(String field1, Object value1,String field2, Object value2,boolean isField){
		if (StringUtils.isEmpty(field1)) {
			return;
		}
		Condition con1 = new Condition(field1, value1, "=",false);
		Condition con2 = new Condition(field2, value2, "=",isField);
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		this.andStartWith = "start with " + sb1.append(field1).append("='").append(value1).append("'") + "connect by prior " + sb2.append(field2).append("=").append(value2); 
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		if (StringUtils.isEmpty(orderBy)) {
			return;
		}
		this.orderBy = "order by " + orderBy;
	}

	public String getGroupBy() {
		return groupBy;
	}

	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public class Condition {
		String field;
		Object value;
		String clause;
		boolean isField;

		public Condition() {
		}

		public Condition(String field, Object value, String clause,
				boolean isField) {
			this.field = field;
			this.value = value;
			this.clause = clause;
			this.isField = isField;
		}

		public String getField() {
			return field;
		}

		public void setField(String field) {
			this.field = field;
		}

		public Object getValue() {
			return value;
		}

		public void setValue(Object value) {
			this.value = value;
		}

		public String getClause() {
			return clause;
		}

		public void setClause(String clause) {
			this.clause = clause;
		}

		public boolean getIsField() {
			return isField;
		}

		public void setIsField(boolean isField) {
			this.isField = isField;
		}
	}
}
