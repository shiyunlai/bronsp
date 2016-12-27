
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package com.bronsp.rservice.acct;

import java.util.List;

import com.bronsp.base.WhereCondition;
import com.bronsp.model.po.acct.TbGnl;

 
/**
 * 总账(tb_gnl)的基础远程服务接口定义
 * from bizmodel 'acct'
 * auto generated
 *
 */
public interface ITbGnlRService {
	
	/**
	 * 新增总账(tb_gnl)
	 * @param t 新记录
	 */
	public void insert(TbGnl t);

	/**
	 * 更新总账(tb_gnl),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(TbGnl t);

	/**
	 * 强制更新总账(tb_gnl)
	 * @param t 新值
	 */
	public void updateForce(TbGnl t);

	/**
	 * 删除总账(tb_gnl)
	 * @param id 记录id
	 */
	public void delete(String id);

	/**
	 * 根据条件删除总账(tb_gnl)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新总账(tb_gnl)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, TbGnl t);

	/**
	 * 根据条件查询总账(tb_gnl)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<TbGnl> query(WhereCondition wc);

	/**
	 * 根据条件统计总账(tb_gnl)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询总账(tb_gnl)记录
	 * @param id 记录id
	 * @return 匹配的记录
	 */
	public TbGnl loadById(String id);
}
