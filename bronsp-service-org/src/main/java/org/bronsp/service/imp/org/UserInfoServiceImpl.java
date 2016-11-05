/**
 * 
 */
package org.bronsp.service.imp.org;

import java.util.List;

import org.bronsp.core.WhereCondition;
import org.bronsp.facade.org.IUserInfoService;
import org.bronsp.service.dao.org.Btf_user_infoDao;
import org.fone.bronsp.org.model.po.Btf_user_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author megapro
 *
 */
@Service("userInfoServiceImpl")
public class UserInfoServiceImpl implements IUserInfoService {

	@Autowired
	Btf_user_infoDao btf_user_infoDao;
	
	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IUserInfoService#insert(org.fone.brons.core.model.Btf_user_info)
	 */
	public void insert(Btf_user_info t) {
		btf_user_infoDao.insert( t);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IUserInfoService#update(org.fone.brons.core.model.Btf_user_info)
	 */
	public void update(Btf_user_info t) {
		btf_user_infoDao.update(t);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IUserInfoService#updateForce(org.fone.brons.core.model.Btf_user_info)
	 */
	public void updateForce(Btf_user_info t) {
		btf_user_infoDao.updateForce(t);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IUserInfoService#delete(java.lang.String)
	 */
	public void delete(String id) {
		btf_user_infoDao.delete(id);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IUserInfoService#deleteByCondition(org.fone.brons.core.base.WhereCondition)
	 */
	public void deleteByCondition(WhereCondition wc) {
		btf_user_infoDao.deleteByCondition(wc);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IUserInfoService#updateByCondition(org.fone.brons.core.base.WhereCondition, org.fone.brons.core.model.Btf_user_info)
	 */
	public void updateByCondition(WhereCondition wc, Btf_user_info t) {
		btf_user_infoDao.updateByCondition(wc, t);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IUserInfoService#query(org.fone.brons.core.base.WhereCondition)
	 */
	public List<Btf_user_info> query(WhereCondition wc) {
		return btf_user_infoDao.query(wc);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IUserInfoService#count(org.fone.brons.core.base.WhereCondition)
	 */
	public int count(WhereCondition wc) {
		return btf_user_infoDao.count(wc);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IUserInfoService#loadById(java.lang.String)
	 */
	public Btf_user_info loadById(String id) {
		return btf_user_infoDao.loadById(id);
	}

}
