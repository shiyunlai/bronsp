/**
 * 
 */
package org.fone.bronsp.org.service;

import org.fone.bronsp.org.model.dto.OrgInfoDto;
import org.fone.bronsp.org.model.po.Btf_org_info;

/**
 * 
 * 服务接口定义：组织机构服务
 * 
 * @author megapro
 *
 */
public interface OrgRemoteService {

	/**
	 * 生成一个不重复的机构代码
	 */
	public String genOrgCode() ;
	
	/**
	 * 新增一个机构信息
	 * @param orgInfoDto 需要新增的机构信息，新增一条机构最少需要赋值内容见：{@link OrgInfoDto}
	 * @return 新增成功的机构记录信息
	 */
	public Btf_org_info addOrgInfo(OrgInfoDto orgInfoDto) ;
	
	
	/**
	 * 根据记录唯一ID查询机构记录
	 * @param ID 机构唯一ID
	 * @return 机构记录信息
	 */
	public Btf_org_info queryOrgInfoById(String ID) ;
}
