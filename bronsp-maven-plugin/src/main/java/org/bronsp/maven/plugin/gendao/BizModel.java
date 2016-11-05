package org.bronsp.maven.plugin.gendao;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.apache.commons.lang.StringUtils;
import org.bronsp.maven.plugin.gendao.api.IGenModelDefine;
import org.bronsp.maven.plugin.utils.PinyinUtil;

/**
 * 
 * 某个业务域所有的模型定义（每个定义文件解析后形成一个BizModel）
 * 
 * @author megapro
 *
 */
@XmlRootElement(name = "bizmodel")
public class BizModel implements IGenModelDefine{

	/**
	 * 业务域ID必须设置
	 */
	@XmlAttribute(required=true)
	private String id;

	/**
	 * 业务域名称
	 */
	@XmlAttribute(required=false)
	private String name;
	
	/**
	 * 业务域描述信息
	 */
	@XmlElement(required=false)
	private String desc ; 
	
	/**
	 * models模型所在的定义文件名
	 */
	private String modelDefFile ; 
	
	/**
	 * 本业务域的package
	 * </br>主package路径
	 */
	private String packageName ; 
	
	/**
	 * 某个业务域中的模型定义
	 */
	@XmlElementWrapper(name = "models")
	@XmlElement(name = "model")
	private List<Model> models = new ArrayList<Model>();

	@XmlTransient
	public String getName() {
		return name;
	}

	@XmlTransient
	public String getId() {
		if (StringUtils.isNotEmpty(id)) {
			return id;
		}
		return PinyinUtil.convert(name);
	}

	@XmlTransient
	public String getDesc() {
		return desc;
	}

	@XmlTransient	
	public List<Model> getModels() {
		return models;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}
	
	public String getModelDefFile() {
		return this.modelDefFile ; 
	}
	
	public void setModelDefFile(String path) {
		this.modelDefFile =path;
	}
	
	public String getPackageName() {
		return packageName;
	}

	/**
	 * </br>主package路径
	 * @param packageName
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(id).append(" ").append(name).append(" ").append(modelDefFile).append("\n");
		for( Model m : models ){
			sb.append("- ").append(m.toString()).append("\n"); 
		}
		return sb.toString();
	}
}
