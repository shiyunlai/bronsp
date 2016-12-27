/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
 package com.bronsp.model.po.acct;

import java.util.Date;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * 
 * <pre>
 * 自动生成，不修改。
 * 角色信息表
 * 描述：角色信息，存放角色基本信息定义
 * 定义来自 ： 
 *  业务域：acct
 *  模型：btf_role_info 角色信息表
 *  定义文件：/Users/megapro/Develop/brons/bronsp/bronsp-maven-plugin/model/model-acct.xml
 * </pre>
 * @author mvn bronsp:gendao
 *
 */
public class BtfRoleInfo implements Serializable {

 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private String id;//唯一ID
	 private String paper_code;//试卷编码
	 private String course_code;//课程编码
	 private Long seq_no;//顺序号
	 private String paper_name;//考卷名称
	 private String paper_desc;//卷首语
	 private String ext0;//ext0
	 private String ext1;//ext1
	 private String ext2;//ext2
	
	public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
	 public String getId(){
        return id;
    }
	public void setPaper_code(String paper_code) {
        this.paper_code = paper_code == null ? null : paper_code.trim();
    }
	 public String getPaper_code(){
        return paper_code;
    }
	public void setCourse_code(String course_code) {
        this.course_code = course_code == null ? null : course_code.trim();
    }
	 public String getCourse_code(){
        return course_code;
    }
	 public void setSeq_no(Long seq_no) {
        this.seq_no = seq_no ;
    }
	 public Long getSeq_no(){
		if(seq_no==null){
			return 0l;
		}
        return seq_no;
    }
	public void setPaper_name(String paper_name) {
        this.paper_name = paper_name == null ? null : paper_name.trim();
    }
	 public String getPaper_name(){
        return paper_name;
    }
	public void setPaper_desc(String paper_desc) {
        this.paper_desc = paper_desc == null ? null : paper_desc.trim();
    }
	 public String getPaper_desc(){
        return paper_desc;
    }
	public void setExt0(String ext0) {
        this.ext0 = ext0 == null ? null : ext0.trim();
    }
	 public String getExt0(){
        return ext0;
    }
	public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }
	 public String getExt1(){
        return ext1;
    }
	public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }
	 public String getExt2(){
        return ext2;
    }
}