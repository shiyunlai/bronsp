
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package com.bronsp.rservice.acct;

import java.util.List;

import com.bronsp.base.WhereCondition;
import com.bronsp.model.po.acct.BtfRoleInfo;

 
/**
 * 角色信息表(btf_role_info)的基础远程服务接口定义
 * from bizmodel 'acct'
 * auto generated
 *
 */
public interface IBtfRoleInfoRService {
	
	/**
	 * 新增角色信息表(btf_role_info)
	 * @param t 新记录
	 */
	public void insert(BtfRoleInfo t);

	/**
	 * 更新角色信息表(btf_role_info),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(BtfRoleInfo t);

	/**
	 * 强制更新角色信息表(btf_role_info)
	 * @param t 新值
	 */
	public void updateForce(BtfRoleInfo t);

	/**
	 * 删除角色信息表(btf_role_info)
	 * @param id 记录id
	 */
	public void delete(String id);

	/**
	 * 根据条件删除角色信息表(btf_role_info)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新角色信息表(btf_role_info)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, BtfRoleInfo t);

	/**
	 * 根据条件查询角色信息表(btf_role_info)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<BtfRoleInfo> query(WhereCondition wc);

	/**
	 * 根据条件统计角色信息表(btf_role_info)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询角色信息表(btf_role_info)记录
	 * @param id 记录id
	 * @return 匹配的记录
	 */
	public BtfRoleInfo loadById(String id);
}
