/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package com.bronsp.service.acct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bronsp.base.WhereCondition;

import com.bronsp.dao.mapper.acct.BtfRoleInfoMapper;
import com.bronsp.model.po.acct.BtfRoleInfo;


/**
 * 业务逻辑
 * @author by auto-gen
 *
 */
@Service
public class BtfRoleInfoService {

	@Autowired
	BtfRoleInfoMapper btfRoleInfoMapper;
	
    public void insert(BtfRoleInfo t){
    	btfRoleInfoMapper.insert(t);
    }
    
    public void update(BtfRoleInfo t){
    	btfRoleInfoMapper.update(t); 
    }
   
    public void updateForce(BtfRoleInfo t){
    	btfRoleInfoMapper.updateForce(t); 
    }
   
    public void delete(String id){
    	btfRoleInfoMapper.delete(id);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	btfRoleInfoMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,BtfRoleInfo t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	btfRoleInfoMapper.updateByCondition(map); 
    }

    public List<BtfRoleInfo> query(WhereCondition wc){
    	return btfRoleInfoMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return btfRoleInfoMapper.count(wc);
    }
   
    public BtfRoleInfo loadById(String id){
    	return btfRoleInfoMapper.loadById(id);
    }
}
