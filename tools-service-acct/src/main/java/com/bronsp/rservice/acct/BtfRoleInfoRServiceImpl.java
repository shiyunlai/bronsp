
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package com.bronsp.rservice.acct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.bronsp.base.WhereCondition;
import com.bronsp.model.po.acct.BtfRoleInfo;
import com.bronsp.rservice.acct.IBtfRoleInfoRService;
import com.bronsp.service.acct.BtfRoleInfoService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 角色信息表(btf_role_info) 基本远程服务实现(服务提供者)
 * 
 * @author by auto-gen
 *
 */
//TEMPLATES
@Service(group = "acct", version = "1.0", interfaceClass = IBtfRoleInfoRService.class, timeout = 2000, document = "角色信息表的基础远程服务")
public class BtfRoleInfoRServiceImpl implements IBtfRoleInfoRService {

	@Autowired
	BtfRoleInfoService btfRoleInfoService;

	@Override
	public void insert(BtfRoleInfo t) {
		btfRoleInfoService.insert(t);
	}

	@Override
	public void update(BtfRoleInfo t) {
		btfRoleInfoService.update(t);
	}

	@Override
	public void updateForce(BtfRoleInfo t) {
		btfRoleInfoService.updateForce(t);
	}

	@Override
	public void delete(String id) {
		btfRoleInfoService.delete(id);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		btfRoleInfoService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, BtfRoleInfo t) {
		btfRoleInfoService.updateByCondition(wc,t);
	}

	@Override
	public List<BtfRoleInfo> query(WhereCondition wc) {
		return btfRoleInfoService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return btfRoleInfoService.count(wc);
	}

	@Override
	public BtfRoleInfo loadById(String id) {
		return btfRoleInfoService.loadById(id);
	}

}
