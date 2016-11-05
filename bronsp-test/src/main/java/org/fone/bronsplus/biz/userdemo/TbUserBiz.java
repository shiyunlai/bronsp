/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.fone.bronsplus.biz.userdemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.fone.bronsp.base.WhereCondition;

import org.fone.bronsplus.dao.mapper.userdemo.TbUserMapper;
import org.fone.bronsplus.model.po.userdemo.TbUser;


/**
 * 业务逻辑
 * @author su.zhang
 *
 */
@Service
public class TbUserBiz {

	@Autowired
	TbUserMapper tbUserMapper;
	
    public void insert(TbUser t){
    	tbUserMapper.insert(t);
    }
    
    public void update(TbUser t){
    	tbUserMapper.update(t); 
    }
   
    public void updateForce(TbUser t){
    	tbUserMapper.updateForce(t); 
    }
   
    public void delete(String id){
    	tbUserMapper.delete(id);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	tbUserMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,TbUser t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	tbUserMapper.updateByCondition(map); 
    }

    public List<TbUser> query(WhereCondition wc){
    	return tbUserMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return tbUserMapper.count(wc);
    }
   
    public TbUser loadById(String id){
    	return tbUserMapper.loadById(id);
    }
}
