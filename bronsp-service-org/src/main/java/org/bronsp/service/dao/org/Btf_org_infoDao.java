package org.bronsp.service.dao.org;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bronsp.core.WhereCondition;
import org.fone.bronsp.org.model.po.Btf_org_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Btf_org_infoDao {
	@Autowired
	Btf_org_infoMapper btf_org_infoMapper;
    public void insert(Btf_org_info t){
    	btf_org_infoMapper.insert(t);
    }
    
    public void update(Btf_org_info t){
    	btf_org_infoMapper.update(t); 
    }
   
    public void updateForce(Btf_org_info t){
    	btf_org_infoMapper.updateForce(t); 
    }
   
    public void delete(String id){
    	btf_org_infoMapper.delete(id);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	btf_org_infoMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,Btf_org_info t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	btf_org_infoMapper.updateByCondition(map); 
    }
    public List<Btf_org_info> query(WhereCondition wc){
    	return btf_org_infoMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return btf_org_infoMapper.count(wc);
    }
   
    public Btf_org_info loadById(String id){
    	return btf_org_infoMapper.loadById(id);
    }
}
