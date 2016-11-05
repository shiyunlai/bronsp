package org.bronsp.service.dao.org;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bronsp.core.WhereCondition;
import org.fone.bronsp.org.model.po.Btf_user_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 服务层
 * @author su.zhang
 *
 */
@Service
public class Btf_user_infoDao {
	
	@Autowired
	Btf_user_infoMapper btf_user_infoMapper;
	
    public void insert(Btf_user_info t){
    	btf_user_infoMapper.insert(t);
    }
    
    public void update(Btf_user_info t){
    	btf_user_infoMapper.update(t); 
    }
   
    public void updateForce(Btf_user_info t){
    	btf_user_infoMapper.updateForce(t); 
    }
   
    public void delete(String id){
    	btf_user_infoMapper.delete(id);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	btf_user_infoMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,Btf_user_info t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	btf_user_infoMapper.updateByCondition(map); 
    }
    public List<Btf_user_info> query(WhereCondition wc){
    	return btf_user_infoMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return btf_user_infoMapper.count(wc);
    }
   
    public Btf_user_info loadById(String id){
    	return btf_user_infoMapper.loadById(id);
    }
    
}
