package org.bronsp.service.dao.org;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bronsp.core.WhereCondition;
import org.fone.bronsp.org.model.po.Btf_emp_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 服务层
 * @author su.zhang
 *
 */
@Service
public class Btf_emp_infoDao {
	
	@Autowired
	Btf_emp_infoMapper btf_emp_infoMapper;
	
    public void insert(Btf_emp_info t){
    	btf_emp_infoMapper.insert(t);
    }
    
    public void update(Btf_emp_info t){
    	btf_emp_infoMapper.update(t); 
    }
   
    public void updateForce(Btf_emp_info t){
    	btf_emp_infoMapper.updateForce(t); 
    }
   
    public void delete(String id){
    	btf_emp_infoMapper.delete(id);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	btf_emp_infoMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,Btf_emp_info t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	btf_emp_infoMapper.updateByCondition(map); 
    }
    public List<Btf_emp_info> query(WhereCondition wc){
    	return btf_emp_infoMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return btf_emp_infoMapper.count(wc);
    }
   
    public Btf_emp_info loadById(String id){
    	return btf_emp_infoMapper.loadById(id);
    }
    
}
