/**
 * 
 */
package org.fone.bronsp.org.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.bronsp.service.dao.org.Btf_org_infoDao;
import org.fone.bronsp.org.model.dto.OrgInfoDto;
import org.fone.bronsp.org.model.po.Btf_org_info;
import org.fone.bronsp.org.service.OrgRemoteService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * 机构组织服务实现
 * 
 * @author megapro
 *
 */
public class OrgRemoteServiceImpl implements OrgRemoteService {

	@Autowired
	Btf_org_infoDao btf_org_infoDao ; 
	
	/* (non-Javadoc)
	 * @see org.fone.bronsp.org.service.OrgRemoteService#genOrgCode()
	 */
	public String genOrgCode() {
		String strTemp = genCodeByType() ;
		return "OG"+strTemp;
	}

	//TODO 可以抽取为专门的代码生成服务
	private String genCodeByType() {
		SimpleDateFormat df = new SimpleDateFormat("yyMMddHHmmSS") ;
		return df.format(new Date() );
	}

	/* (non-Javadoc)
	 * @see org.fone.bronsp.org.service.OrgRemoteService#addOrgInfo(org.fone.bronsp.org.model.dto.OrgInfoDto)
	 */
	public Btf_org_info addOrgInfo(OrgInfoDto orgInfo) {
		System.out.println("dto org_code="+orgInfo.getOrg_code());
		Btf_org_info t = convert(orgInfo)  ; 
		t.setId("ID"+orgInfo.getOrg_code());//自动赋值机构记录ID
		t.setOrg_status("0");//默认机构状态
		btf_org_infoDao.insert(t); 
		return t;
	}

	//TODO 抽取实现为公共的 dto -> po 之间的转换
	private Btf_org_info convert(OrgInfoDto orgInfo) {
		Btf_org_info t = new Btf_org_info() ; 
		t.setOrg_code(orgInfo.getOrg_code() ) ;
		t.setOrg_name(orgInfo.getOrg_name() );
		t.setOrg_name("covert org name!");
		return t;
	}
	
	public Btf_org_info queryOrgInfoById(String ID) {
		
		return btf_org_infoDao.loadById(ID);	
	}

}
