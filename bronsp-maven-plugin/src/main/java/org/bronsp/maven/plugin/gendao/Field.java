package org.bronsp.maven.plugin.gendao;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.StringUtils;
import org.bronsp.maven.plugin.utils.PinyinUtil;

/**
 * <pre>
 * 	-- 说明：name，属性，字段名称。必须定义。 
	-- 说明：id，属性，字段的唯一id，在model范围不能重复。不定义，则系统使用name作为id（拼音）。
	-- 说明：type，属性，定义模型某个属性的类型。不定义，默认为string类型。有如下选项 
	-- 	type="string" 表示字符串，不设置type时，默认为string类型；
	-- 	type="long" 表示整形，同时需要指定length属性；
	-- 	type="decimal" 生成Double类型字段，如 private Double amt；
	-- 	type="bigdecimal" 生成BigDecimal类型字段，同时需要指定length，如：length="10,6" 。一般定义金额，费率等金额数字；
	-- 	type="datetime" 表示是日期类型 其他类型包括，long,string，decimal 默认为string类型；
	-- 说明：length，属性，定义字段的长度，与type配合使用，如： type为String时length="32"、type为bigdecimal时lenth="10,6"。不定义，则系统默认长度， 
	-- 说明：physical，属性，可选true/false，true表示生成数据库字段，false表示不生成数据库字段，但会生成模型中的属性（如果模型中某个字段只是做传输用途，值则应该设置为false）。不定义，则默认为true。； 
	-- 说明：key，属性，可选true/false，true表示为关键字，false不是。不定义，则默认为false。 
 * </pre>
 * @author megapro
 *
 */
@XmlRootElement
public class Field {

	private String name;
	private String id;
	private String type;
	private String length;
	private String search;
	private String form;
	private String physical = "true";// 默认都要生成表字段
	private String key = "false";// 是否关键字段

	@XmlAttribute
	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@XmlAttribute
	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	@XmlAttribute
	public String getId() {
		if (StringUtils.isNotEmpty(id)) {
			return StringUtils.lowerCase(id);//所有Field转为小写字母
		}
		return StringUtils.lowerCase( PinyinUtil.convert(name) ) ;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlAttribute(required=true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute
	public String getType() {
		if (StringUtils.isNotEmpty(type)) {
			return type;
		}
		return "string";
	}

	public void setType(String type) {
		this.type = type;
	}

	@XmlAttribute
	public String getLength() {
		if (StringUtils.isNotEmpty(length)) {
			return length;
		}
		if (StringUtils.equals("bigdecimal", type)) {
			return "15,6";
		}
		if (StringUtils.equals("decimal", type)) {
			return "15,2";
		}
		if (StringUtils.equals("long", type)) {
			return "10";
		}
		return "128";
	}

	public void setLength(String length) {
		this.length = length;
	}

	@XmlAttribute
	public String getPhysical() {
		return physical;
	}

	public void setPhysical(String physical) {
		this.physical = physical;
	}

	@XmlAttribute
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
}
