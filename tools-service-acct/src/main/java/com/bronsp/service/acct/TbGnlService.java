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

import com.bronsp.dao.mapper.acct.TbGnlMapper;
import com.bronsp.model.po.acct.TbGnl;


/**
 * 业务逻辑
 * @author by auto-gen
 *
 */
@Service
public class TbGnlService {

	@Autowired
	TbGnlMapper tbGnlMapper;
	
    public void insert(TbGnl t){
    	tbGnlMapper.insert(t);
    }
    
    public void update(TbGnl t){
    	tbGnlMapper.update(t); 
    }
   
    public void updateForce(TbGnl t){
    	tbGnlMapper.updateForce(t); 
    }
   
    public void delete(String id){
    	tbGnlMapper.delete(id);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	tbGnlMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,TbGnl t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	tbGnlMapper.updateByCondition(map); 
    }

    public List<TbGnl> query(WhereCondition wc){
    	return tbGnlMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return tbGnlMapper.count(wc);
    }
   
    public TbGnl loadById(String id){
    	return tbGnlMapper.loadById(id);
    }
}
