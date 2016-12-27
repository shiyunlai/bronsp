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
 * 总账
 * 描述：总账表，记录用户的总账信息
 * 定义来自 ： 
 *  业务域：acct
 *  模型：tb_gnl 总账
 *  定义文件：/Users/megapro/Develop/brons/bronsp/bronsp-maven-plugin/model/model-acct.xml
 * </pre>
 * @author mvn bronsp:gendao
 *
 */
public class TbGnl implements Serializable {

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
	 private String multi_media_info;//多媒体信息
	 private Long time_exam;//考试时间
	 private String is_re_exam;//是否允许重考
	 private Long times_re_exam;//重考次数限制
	 private Long def_per_score;//默认每题得分
	 private String rule_sort_question;//题目排序规则
	 private String rule_sort_answer;//题目答案排序规则
	 private String feedback_type;//答案反馈方式
	 private BigDecimal expect_fixed;//预期年化利率
	 private BigDecimal not_gen_po;//不生成PO对象
	 private String delstatus;//delstatus
	 private String creatorid;//creatorId
	 private String creatorname;//creatorName
	 private String creatorcode;//creatorCode
	 private String creatoridpath;//creatorIdPath
	 private String creatornamepath;//creatorNamePath
	 private String creatorcodepath;//creatorCodePath
	 private Date createtime;//createTime
	 private Date modifiedtime;//modifiedTime
	 private String ext0;//ext0
	 private String ext1;//ext1
	
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
	public void setMulti_media_info(String multi_media_info) {
        this.multi_media_info = multi_media_info == null ? null : multi_media_info.trim();
    }
	 public String getMulti_media_info(){
        return multi_media_info;
    }
	 public void setTime_exam(Long time_exam) {
        this.time_exam = time_exam ;
    }
	 public Long getTime_exam(){
		if(time_exam==null){
			return 0l;
		}
        return time_exam;
    }
	public void setIs_re_exam(String is_re_exam) {
        this.is_re_exam = is_re_exam == null ? null : is_re_exam.trim();
    }
	 public String getIs_re_exam(){
        return is_re_exam;
    }
	 public void setTimes_re_exam(Long times_re_exam) {
        this.times_re_exam = times_re_exam ;
    }
	 public Long getTimes_re_exam(){
		if(times_re_exam==null){
			return 0l;
		}
        return times_re_exam;
    }
	 public void setDef_per_score(Long def_per_score) {
        this.def_per_score = def_per_score ;
    }
	 public Long getDef_per_score(){
		if(def_per_score==null){
			return 0l;
		}
        return def_per_score;
    }
	public void setRule_sort_question(String rule_sort_question) {
        this.rule_sort_question = rule_sort_question == null ? null : rule_sort_question.trim();
    }
	 public String getRule_sort_question(){
        return rule_sort_question;
    }
	public void setRule_sort_answer(String rule_sort_answer) {
        this.rule_sort_answer = rule_sort_answer == null ? null : rule_sort_answer.trim();
    }
	 public String getRule_sort_answer(){
        return rule_sort_answer;
    }
	public void setFeedback_type(String feedback_type) {
        this.feedback_type = feedback_type == null ? null : feedback_type.trim();
    }
	 public String getFeedback_type(){
        return feedback_type;
    }
	 public void setExpect_fixed(BigDecimal expect_fixed) {
          this.expect_fixed = expect_fixed ;
    }
	 public BigDecimal getExpect_fixed(){
	 if(expect_fixed==null){
			return new BigDecimal(0d);
		}
        return expect_fixed;
    }
	 public void setNot_gen_po(BigDecimal not_gen_po) {
          this.not_gen_po = not_gen_po ;
    }
	 public BigDecimal getNot_gen_po(){
	 if(not_gen_po==null){
			return new BigDecimal(0d);
		}
        return not_gen_po;
    }
	public void setDelstatus(String delstatus) {
        this.delstatus = delstatus == null ? null : delstatus.trim();
    }
	 public String getDelstatus(){
        return delstatus;
    }
	public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }
	 public String getCreatorid(){
        return creatorid;
    }
	public void setCreatorname(String creatorname) {
        this.creatorname = creatorname == null ? null : creatorname.trim();
    }
	 public String getCreatorname(){
        return creatorname;
    }
	public void setCreatorcode(String creatorcode) {
        this.creatorcode = creatorcode == null ? null : creatorcode.trim();
    }
	 public String getCreatorcode(){
        return creatorcode;
    }
	public void setCreatoridpath(String creatoridpath) {
        this.creatoridpath = creatoridpath == null ? null : creatoridpath.trim();
    }
	 public String getCreatoridpath(){
        return creatoridpath;
    }
	public void setCreatornamepath(String creatornamepath) {
        this.creatornamepath = creatornamepath == null ? null : creatornamepath.trim();
    }
	 public String getCreatornamepath(){
        return creatornamepath;
    }
	public void setCreatorcodepath(String creatorcodepath) {
        this.creatorcodepath = creatorcodepath == null ? null : creatorcodepath.trim();
    }
	 public String getCreatorcodepath(){
        return creatorcodepath;
    }
	 public void setCreatetime(Date createtime) {
          this.createtime = createtime ;
    }
	 public Date getCreatetime(){
        return createtime;
    }
	 public void setModifiedtime(Date modifiedtime) {
          this.modifiedtime = modifiedtime ;
    }
	 public Date getModifiedtime(){
        return modifiedtime;
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
}