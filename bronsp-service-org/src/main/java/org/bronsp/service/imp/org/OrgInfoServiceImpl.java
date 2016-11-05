/**
 * 
 */
package org.bronsp.service.imp.org;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.bronsp.core.WhereCondition;
import org.bronsp.facade.org.IOrgInfoService;
import org.bronsp.service.dao.org.Btf_org_infoDao;
import org.fone.bronsp.org.model.po.Btf_org_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author megapro
 *
 */
@Service("orgInfoServiceImpl")
public class OrgInfoServiceImpl implements IOrgInfoService {

	@Autowired
	Btf_org_infoDao btf_org_infoDao ; 
	
	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IOrgInfoService#insert(org.fone.brons.core.model.Btf_org_info)
	 */
	public void insert(Btf_org_info t) {
		try {
			
			System.out.println("here is org insert receive: id is : "+ t.getId() +" org_code is :"+t.getOrg_code() );
			//id 这个值只有org模块才关心，因此应该由org模块自己生成，与调用者无关
			if( StringUtils.isEmpty(t.getId()) ){
				t.setId( Long.valueOf( System.currentTimeMillis()).toString() ) ;
				System.out.println("id is : " + t.getId());
			}
			
			if( t.getOrg_code().length() > 16 ){
				t.setOrg_code( t.getOrg_code().substring(t.getOrg_code().length()-16) ) ;
			}
			
			btf_org_infoDao.insert(t);
			System.out.println("here is org insert save : id is : "+ t.getId() +" org_code is :"+t.getOrg_code() );
			
		} catch (Exception e) {
			System.err.println("执行insert失败");
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IOrgInfoService#update(org.fone.brons.core.model.Btf_org_info)
	 */
	public void update(Btf_org_info t) {
		btf_org_infoDao.update(t);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IOrgInfoService#updateForce(org.fone.brons.core.model.Btf_org_info)
	 */
	public void updateForce(Btf_org_info t) {
		btf_org_infoDao.updateForce(t);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IOrgInfoService#delete(java.lang.String)
	 */
	public void delete(String id) {
		btf_org_infoDao.delete(id);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IOrgInfoService#deleteByCondition(org.fone.brons.core.base.WhereCondition)
	 */
	public void deleteByCondition(WhereCondition wc) {
		btf_org_infoDao.deleteByCondition(wc);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IOrgInfoService#updateByCondition(org.fone.brons.core.base.WhereCondition, org.fone.brons.core.model.Btf_org_info)
	 */
	public void updateByCondition(WhereCondition wc, Btf_org_info t) {
		btf_org_infoDao.updateByCondition(wc, t);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IOrgInfoService#query(org.fone.brons.core.base.WhereCondition)
	 */
	public List<Btf_org_info> query(WhereCondition wc) {
		return btf_org_infoDao.query(wc);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IOrgInfoService#count(org.fone.brons.core.base.WhereCondition)
	 */
	public int count(WhereCondition wc) {
		return btf_org_infoDao.count(wc);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IOrgInfoService#loadById(java.lang.String)
	 */
	public Btf_org_info loadById(String id) {
		return btf_org_infoDao.loadById(id);
	}

}
