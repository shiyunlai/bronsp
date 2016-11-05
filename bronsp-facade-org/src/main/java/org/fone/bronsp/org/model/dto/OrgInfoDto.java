/**
 * 
 */
package org.fone.bronsp.org.model.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 机构信息传输对象
 * 
 * @author megapro
 *
 */
public class OrgInfoDto implements Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = -5175323032225728949L;
	
	private String org_code;//
	 private String org_name;//
	 private String org_ename;//
	 private String org_type;//
	 private String org_degree;//
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
	public String getOrg_code() {
		return org_code;
	}
	public void setOrg_code(String org_code) {
		this.org_code = org_code;
	}
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public String getOrg_ename() {
		return org_ename;
	}
	public void setOrg_ename(String org_ename) {
		this.org_ename = org_ename;
	}
	public String getOrg_type() {
		return org_type;
	}
	public void setOrg_type(String org_type) {
		this.org_type = org_type;
	}
	public String getOrg_degree() {
		return org_degree;
	}
	public void setOrg_degree(String org_degree) {
		this.org_degree = org_degree;
	}
	public String getPar_org_code() {
		return par_org_code;
	}
	public void setPar_org_code(String par_org_code) {
		this.par_org_code = par_org_code;
	}
	public String getOrg_seq() {
		return org_seq;
	}
	public void setOrg_seq(String org_seq) {
		this.org_seq = org_seq;
	}
	public String getOrg_addr() {
		return org_addr;
	}
	public void setOrg_addr(String org_addr) {
		this.org_addr = org_addr;
	}
	public String getOrg_zipcode() {
		return org_zipcode;
	}
	public void setOrg_zipcode(String org_zipcode) {
		this.org_zipcode = org_zipcode;
	}
	public String getOrg_email() {
		return org_email;
	}
	public void setOrg_email(String org_email) {
		this.org_email = org_email;
	}
	public String getOrg_linkman() {
		return org_linkman;
	}
	public void setOrg_linkman(String org_linkman) {
		this.org_linkman = org_linkman;
	}
	public String getOrg_linktel() {
		return org_linktel;
	}
	public void setOrg_linktel(String org_linktel) {
		this.org_linktel = org_linktel;
	}
	public String getLINKMAN() {
		return LINKMAN;
	}
	public void setLINKMAN(String lINKMAN) {
		LINKMAN = lINKMAN;
	}
	public String getORG_MANAGER() {
		return ORG_MANAGER;
	}
	public void setORG_MANAGER(String oRG_MANAGER) {
		ORG_MANAGER = oRG_MANAGER;
	}
	public String getAuth_user_list() {
		return auth_user_list;
	}
	public void setAuth_user_list(String auth_user_list) {
		this.auth_user_list = auth_user_list;
	}
	public Date getSTART_DATE() {
		return START_DATE;
	}
	public void setSTART_DATE(Date sTART_DATE) {
		START_DATE = sTART_DATE;
	}
	public Date getEND_DATE() {
		return END_DATE;
	}
	public void setEND_DATE(Date eND_DATE) {
		END_DATE = eND_DATE;
	}
	public String getAREA() {
		return AREA;
	}
	public void setAREA(String aREA) {
		AREA = aREA;
	}
	public String getOPEN_TIME() {
		return OPEN_TIME;
	}
	public void setOPEN_TIME(String oPEN_TIME) {
		OPEN_TIME = oPEN_TIME;
	}
	public String getCLOSE_TIME() {
		return CLOSE_TIME;
	}
	public void setCLOSE_TIME(String cLOSE_TIME) {
		CLOSE_TIME = cLOSE_TIME;
	}
	public String getMARK() {
		return MARK;
	}
	public void setMARK(String mARK) {
		MARK = mARK;
	}
	public Date getPEN_DATE() {
		return PEN_DATE;
	}
	public void setPEN_DATE(Date pEN_DATE) {
		PEN_DATE = pEN_DATE;
	}
	public Date getORG_ACCT_DATE() {
		return ORG_ACCT_DATE;
	}
	public void setORG_ACCT_DATE(Date oRG_ACCT_DATE) {
		ORG_ACCT_DATE = oRG_ACCT_DATE;
	}
	public String getOP_FLAG() {
		return OP_FLAG;
	}
	public void setOP_FLAG(String oP_FLAG) {
		OP_FLAG = oP_FLAG;
	}
	public String getTD_FLAG() {
		return TD_FLAG;
	}
	public void setTD_FLAG(String tD_FLAG) {
		TD_FLAG = tD_FLAG;
	}
	public String getFOR_TYPE() {
		return FOR_TYPE;
	}
	public void setFOR_TYPE(String fOR_TYPE) {
		FOR_TYPE = fOR_TYPE;
	}
	public Integer getCASH_USER_CNT() {
		return CASH_USER_CNT;
	}
	public void setCASH_USER_CNT(Integer cASH_USER_CNT) {
		CASH_USER_CNT = cASH_USER_CNT;
	}
	public Integer getMCCTL_USER_CNT() {
		return MCCTL_USER_CNT;
	}
	public void setMCCTL_USER_CNT(Integer mCCTL_USER_CNT) {
		MCCTL_USER_CNT = mCCTL_USER_CNT;
	}
	 
}
