/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.fone.bronsplus.biz.acct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.fone.bronsp.base.WhereCondition;

import org.fone.bronsplus.dao.mapper.acct.TbGnlMapper;
import org.fone.bronsplus.model.po.acct.TbGnl;


/**
 * 业务逻辑
 * @author su.zhang
 *
 */
@Service
public class TbGnlBiz {

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
