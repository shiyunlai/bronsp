package org.fone.bronsp.org.model.po;
import java.util.Date;

import org.bronsp.core.BaseModel;

public class Btf_org_info extends BaseModel {
	 private String id;//
	 private String org_code;//
	 private String org_name;//
	 private String org_ename;//
	 private String org_type;//
	 private String org_degree;//
	 private String org_status;//
	 private String org_work_status;//
	 private Date logout_time;//
	 private Date login_time;//
	 private String valid_flag;//
	 private String par_org_code;//
	 private String org_seq;//
	 private String org_addr;//
	 private String org_zipcode;//
	 private String org_email;//
	 private String org_linkman;//
	 private String org_linktel;//
	 private String LINKMAN;//
	 private String ORG_MANAGER;//
	 private String auth_user_list;//
	 private Date START_DATE;//
	 private Date END_DATE;//
	 private String AREA;//
	 private String OPEN_TIME;//
	 private String CLOSE_TIME;//
	 private String MARK;//
	 private Date PEN_DATE;//
	 private Date ORG_ACCT_DATE;//
	 private String OP_FLAG;//
	 private String TD_FLAG;//
	 private String FOR_TYPE;//
	 private Integer CASH_USER_CNT;//
	 private Integer MCCTL_USER_CNT;//
	 private String SIGN_OUT_FLAG;//
	
	public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
	 public String getId(){
        return id;
    }
	public void setOrg_code(String org_code) {
        this.org_code = org_code == null ? null : org_code.trim();
    }
	 public String getOrg_code(){
        return org_code;
    }
	public void setOrg_name(String org_name) {
        this.org_name = org_name == null ? null : org_name.trim();
    }
	 public String getOrg_name(){
        return org_name;
    }
	public void setOrg_ename(String org_ename) {
        this.org_ename = org_ename == null ? null : org_ename.trim();
    }
	 public String getOrg_ename(){
        return org_ename;
    }
	public void setOrg_type(String org_type) {
        this.org_type = org_type == null ? null : org_type.trim();
    }
	 public String getOrg_type(){
        return org_type;
    }
	public void setOrg_degree(String org_degree) {
        this.org_degree = org_degree == null ? null : org_degree.trim();
    }
	 public String getOrg_degree(){
        return org_degree;
    }
	public void setOrg_status(String org_status) {
        this.org_status = org_status == null ? null : org_status.trim();
    }
	 public String getOrg_status(){
        return org_status;
    }
	public void setOrg_work_status(String org_work_status) {
        this.org_work_status = org_work_status == null ? null : org_work_status.trim();
    }
	 public String getOrg_work_status(){
        return org_work_status;
    }
	 public void setLogout_time(Date logout_time) {
          this.logout_time = logout_time ;
    }
	 public Date getLogout_time(){
        return logout_time;
    }
	 public void setLogin_time(Date login_time) {
          this.login_time = login_time ;
    }
	 public Date getLogin_time(){
        return login_time;
    }
	public void setValid_flag(String valid_flag) {
        this.valid_flag = valid_flag == null ? null : valid_flag.trim();
    }
	 public String getValid_flag(){
        return valid_flag;
    }
	public void setPar_org_code(String par_org_code) {
        this.par_org_code = par_org_code == null ? null : par_org_code.trim();
    }
	 public String getPar_org_code(){
        return par_org_code;
    }
	public void setOrg_seq(String org_seq) {
        this.org_seq = org_seq == null ? null : org_seq.trim();
    }
	 public String getOrg_seq(){
        return org_seq;
    }
	public void setOrg_addr(String org_addr) {
        this.org_addr = org_addr == null ? null : org_addr.trim();
    }
	 public String getOrg_addr(){
        return org_addr;
    }
	public void setOrg_zipcode(String org_zipcode) {
        this.org_zipcode = org_zipcode == null ? null : org_zipcode.trim();
    }
	 public String getOrg_zipcode(){
        return org_zipcode;
    }
	public void setOrg_email(String org_email) {
        this.org_email = org_email == null ? null : org_email.trim();
    }
	 public String getOrg_email(){
        return org_email;
    }
	public void setOrg_linkman(String org_linkman) {
        this.org_linkman = org_linkman == null ? null : org_linkman.trim();
    }
	 public String getOrg_linkman(){
        return org_linkman;
    }
	public void setOrg_linktel(String org_linktel) {
        this.org_linktel = org_linktel == null ? null : org_linktel.trim();
    }
	 public String getOrg_linktel(){
        return org_linktel;
    }
	public void setLINKMAN(String LINKMAN) {
        this.LINKMAN = LINKMAN == null ? null : LINKMAN.trim();
    }
	 public String getLINKMAN(){
        return LINKMAN;
    }
	public void setORG_MANAGER(String ORG_MANAGER) {
        this.ORG_MANAGER = ORG_MANAGER == null ? null : ORG_MANAGER.trim();
    }
	 public String getORG_MANAGER(){
        return ORG_MANAGER;
    }
	public void setAuth_user_list(String auth_user_list) {
        this.auth_user_list = auth_user_list == null ? null : auth_user_list.trim();
    }
	 public String getAuth_user_list(){
        return auth_user_list;
    }
	 public void setSTART_DATE(Date START_DATE) {
          this.START_DATE = START_DATE ;
    }
	 public Date getSTART_DATE(){
        return START_DATE;
    }
	 public void setEND_DATE(Date END_DATE) {
          this.END_DATE = END_DATE ;
    }
	 public Date getEND_DATE(){
        return END_DATE;
    }
	public void setAREA(String AREA) {
        this.AREA = AREA == null ? null : AREA.trim();
    }
	 public String getAREA(){
        return AREA;
    }
	public void setOPEN_TIME(String OPEN_TIME) {
        this.OPEN_TIME = OPEN_TIME == null ? null : OPEN_TIME.trim();
    }
	 public String getOPEN_TIME(){
        return OPEN_TIME;
    }
	public void setCLOSE_TIME(String CLOSE_TIME) {
        this.CLOSE_TIME = CLOSE_TIME == null ? null : CLOSE_TIME.trim();
    }
	 public String getCLOSE_TIME(){
        return CLOSE_TIME;
    }
	public void setMARK(String MARK) {
        this.MARK = MARK == null ? null : MARK.trim();
    }
	 public String getMARK(){
        return MARK;
    }
	 public void setPEN_DATE(Date PEN_DATE) {
          this.PEN_DATE = PEN_DATE ;
    }
	 public Date getPEN_DATE(){
        return PEN_DATE;
    }
	 public void setORG_ACCT_DATE(Date ORG_ACCT_DATE) {
          this.ORG_ACCT_DATE = ORG_ACCT_DATE ;
    }
	 public Date getORG_ACCT_DATE(){
        return ORG_ACCT_DATE;
    }
	public void setOP_FLAG(String OP_FLAG) {
        this.OP_FLAG = OP_FLAG == null ? null : OP_FLAG.trim();
    }
	 public String getOP_FLAG(){
        return OP_FLAG;
    }
	public void setTD_FLAG(String TD_FLAG) {
        this.TD_FLAG = TD_FLAG == null ? null : TD_FLAG.trim();
    }
	 public String getTD_FLAG(){
        return TD_FLAG;
    }
	public void setFOR_TYPE(String FOR_TYPE) {
        this.FOR_TYPE = FOR_TYPE == null ? null : FOR_TYPE.trim();
    }
	 public String getFOR_TYPE(){
        return FOR_TYPE;
    }
	 public void setCASH_USER_CNT(Integer CASH_USER_CNT) {
          this.CASH_USER_CNT = CASH_USER_CNT ;
    }
	 public Integer getCASH_USER_CNT(){
        return CASH_USER_CNT;
    }
	 public void setMCCTL_USER_CNT(Integer MCCTL_USER_CNT) {
          this.MCCTL_USER_CNT = MCCTL_USER_CNT ;
    }
	 public Integer getMCCTL_USER_CNT(){
        return MCCTL_USER_CNT;
    }
	public void setSIGN_OUT_FLAG(String SIGN_OUT_FLAG) {
        this.SIGN_OUT_FLAG = SIGN_OUT_FLAG == null ? null : SIGN_OUT_FLAG.trim();
    }
	 public String getSIGN_OUT_FLAG(){
        return SIGN_OUT_FLAG;
    }
}