
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package com.bronsp.rservice.acct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.bronsp.base.WhereCondition;
import com.bronsp.model.po.acct.TbGnl;
import com.bronsp.rservice.acct.ITbGnlRService;
import com.bronsp.service.acct.TbGnlService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 总账(tb_gnl) 基本远程服务实现(服务提供者)
 * 
 * @author by auto-gen
 *
 */
//TEMPLATES
@Service(group = "acct", version = "1.0", interfaceClass = ITbGnlRService.class, timeout = 2000, document = "总账的基础远程服务")
public class TbGnlRServiceImpl implements ITbGnlRService {

	@Autowired
	TbGnlService tbGnlService;

	@Override
	public void insert(TbGnl t) {
		tbGnlService.insert(t);
	}

	@Override
	public void update(TbGnl t) {
		tbGnlService.update(t);
	}

	@Override
	public void updateForce(TbGnl t) {
		tbGnlService.updateForce(t);
	}

	@Override
	public void delete(String id) {
		tbGnlService.delete(id);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		tbGnlService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, TbGnl t) {
		tbGnlService.updateByCondition(wc,t);
	}

	@Override
	public List<TbGnl> query(WhereCondition wc) {
		return tbGnlService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return tbGnlService.count(wc);
	}

	@Override
	public TbGnl loadById(String id) {
		return tbGnlService.loadById(id);
	}

}
