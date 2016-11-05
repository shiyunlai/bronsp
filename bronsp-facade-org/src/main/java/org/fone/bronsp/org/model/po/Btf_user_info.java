package org.fone.bronsp.org.model.po;
import java.util.Date;

import org.bronsp.core.BaseModel;
/**
 * 
 * @author su.zhang
 *
 */
public class Btf_user_info extends BaseModel {
	 private String id;//
	 private String user_code;//
	 private String emp_code;//
	 private String user_name;//
	 private String user_type;//
	 private String user_level;//
	 private String sub_type;//
	 private String login_type;//
	 private String org_code;//
	 private String core_user_flag;//
	 private String user_status;//
	 private String work_status;//
	 private Date login_time;//
	 private Date logout_time;//
	 private String login_ip;//
	 private String user_password;//
	 private String auth_mode;//
	 private String pw_status;//
	 private Integer pw_cnt;//
	 private Date lock_time;//
	 private Date unlock_time;//
	 private Date chg_date;//
	 private Integer chg_interval;//
	 private Date inval_date;//
	 private Date eff_date;//
	 private Date lose_date;//
	 private String eff_time_range;//
	 private String auth_level;//
	 private String cash_flag;//
	 private String mc_flag;//
	
	public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
	 public String getId(){
        return id;
    }
	public void setUser_code(String user_code) {
        this.user_code = user_code == null ? null : user_code.trim();
    }
	 public String getUser_code(){
        return user_code;
    }
	public void setEmp_code(String emp_code) {
        this.emp_code = emp_code == null ? null : emp_code.trim();
    }
	 public String getEmp_code(){
        return emp_code;
    }
	public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }
	 public String getUser_name(){
        return user_name;
    }
	public void setUser_type(String user_type) {
        this.user_type = user_type == null ? null : user_type.trim();
    }
	 public String getUser_type(){
        return user_type;
    }
	public void setUser_level(String user_level) {
        this.user_level = user_level == null ? null : user_level.trim();
    }
	 public String getUser_level(){
        return user_level;
    }
	public void setSub_type(String sub_type) {
        this.sub_type = sub_type == null ? null : sub_type.trim();
    }
	 public String getSub_type(){
        return sub_type;
    }
	public void setLogin_type(String login_type) {
        this.login_type = login_type == null ? null : login_type.trim();
    }
	 public String getLogin_type(){
        return login_type;
    }
	public void setOrg_code(String org_code) {
        this.org_code = org_code == null ? null : org_code.trim();
    }
	 public String getOrg_code(){
        return org_code;
    }
	public void setCore_user_flag(String core_user_flag) {
        this.core_user_flag = core_user_flag == null ? null : core_user_flag.trim();
    }
	 public String getCore_user_flag(){
        return core_user_flag;
    }
	public void setUser_status(String user_status) {
        this.user_status = user_status == null ? null : user_status.trim();
    }
	 public String getUser_status(){
        return user_status;
    }
	public void setWork_status(String work_status) {
        this.work_status = work_status == null ? null : work_status.trim();
    }
	 public String getWork_status(){
        return work_status;
    }
	 public void setLogin_time(Date login_time) {
          this.login_time = login_time ;
    }
	 public Date getLogin_time(){
        return login_time;
    }
	 public void setLogout_time(Date logout_time) {
          this.logout_time = logout_time ;
    }
	 public Date getLogout_time(){
        return logout_time;
    }
	public void setLogin_ip(String login_ip) {
        this.login_ip = login_ip == null ? null : login_ip.trim();
    }
	 public String getLogin_ip(){
        return login_ip;
    }
	public void setUser_password(String user_password) {
        this.user_password = user_password == null ? null : user_password.trim();
    }
	 public String getUser_password(){
        return user_password;
    }
	public void setAuth_mode(String auth_mode) {
        this.auth_mode = auth_mode == null ? null : auth_mode.trim();
    }
	 public String getAuth_mode(){
        return auth_mode;
    }
	public void setPw_status(String pw_status) {
        this.pw_status = pw_status == null ? null : pw_status.trim();
    }
	 public String getPw_status(){
        return pw_status;
    }
	 public void setPw_cnt(Integer pw_cnt) {
          this.pw_cnt = pw_cnt ;
    }
	 public Integer getPw_cnt(){
        return pw_cnt;
    }
	 public void setLock_time(Date lock_time) {
          this.lock_time = lock_time ;
    }
	 public Date getLock_time(){
        return lock_time;
    }
	 public void setUnlock_time(Date unlock_time) {
          this.unlock_time = unlock_time ;
    }
	 public Date getUnlock_time(){
        return unlock_time;
    }
	 public void setChg_date(Date chg_date) {
          this.chg_date = chg_date ;
    }
	 public Date getChg_date(){
        return chg_date;
    }
	 public void setChg_interval(Integer chg_interval) {
          this.chg_interval = chg_interval ;
    }
	 public Integer getChg_interval(){
        return chg_interval;
    }
	 public void setInval_date(Date inval_date) {
          this.inval_date = inval_date ;
    }
	 public Date getInval_date(){
        return inval_date;
    }
	 public void setEff_date(Date eff_date) {
          this.eff_date = eff_date ;
    }
	 public Date getEff_date(){
        return eff_date;
    }
	 public void setLose_date(Date lose_date) {
          this.lose_date = lose_date ;
    }
	 public Date getLose_date(){
        return lose_date;
    }
	public void setEff_time_range(String eff_time_range) {
        this.eff_time_range = eff_time_range == null ? null : eff_time_range.trim();
    }
	 public String getEff_time_range(){
        return eff_time_range;
    }
	public void setAuth_level(String auth_level) {
        this.auth_level = auth_level == null ? null : auth_level.trim();
    }
	 public String getAuth_level(){
        return auth_level;
    }
	public void setCash_flag(String cash_flag) {
        this.cash_flag = cash_flag == null ? null : cash_flag.trim();
    }
	 public String getCash_flag(){
        return cash_flag;
    }
	public void setMc_flag(String mc_flag) {
        this.mc_flag = mc_flag == null ? null : mc_flag.trim();
    }
	 public String getMc_flag(){
        return mc_flag;
    }
}