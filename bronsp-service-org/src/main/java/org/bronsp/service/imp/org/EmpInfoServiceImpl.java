/**
 * 
 */
package org.bronsp.service.imp.org;

import java.util.List;

import org.bronsp.core.WhereCondition;
import org.bronsp.facade.org.IEmpInfoService;
import org.bronsp.service.dao.org.Btf_emp_infoDao;
import org.fone.bronsp.org.model.po.Btf_emp_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author megapro
 *
 */
@Service("empInfoServiceImpl")
public class EmpInfoServiceImpl implements IEmpInfoService {

	@Autowired
	Btf_emp_infoDao btf_emp_infoDao ; 
	
	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IEmpInfoService#insert(org.fone.brons.core.model.Btf_emp_info)
	 */
	public void insert(Btf_emp_info t) {
		btf_emp_infoDao.insert(t);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IEmpInfoService#update(org.fone.brons.core.model.Btf_emp_info)
	 */
	public void update(Btf_emp_info t) {
		btf_emp_infoDao.update(t);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IEmpInfoService#updateForce(org.fone.brons.core.model.Btf_emp_info)
	 */
	public void updateForce(Btf_emp_info t) {
		btf_emp_infoDao.updateForce(t);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IEmpInfoService#delete(java.lang.String)
	 */
	public void delete(String id) {
		btf_emp_infoDao.delete(id);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IEmpInfoService#deleteByCondition(org.fone.brons.core.base.WhereCondition)
	 */
	public void deleteByCondition(WhereCondition wc) {
		btf_emp_infoDao.deleteByCondition(wc);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IEmpInfoService#updateByCondition(org.fone.brons.core.base.WhereCondition, org.fone.brons.core.model.Btf_emp_info)
	 */
	public void updateByCondition(WhereCondition wc, Btf_emp_info t) {
		btf_emp_infoDao.updateByCondition(wc, t);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IEmpInfoService#query(org.fone.brons.core.base.WhereCondition)
	 */
	public List<Btf_emp_info> query(WhereCondition wc) {
		return btf_emp_infoDao.query(wc);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IEmpInfoService#count(org.fone.brons.core.base.WhereCondition)
	 */
	public int count(WhereCondition wc) {
		return btf_emp_infoDao.count(wc);
	}

	/* (non-Javadoc)
	 * @see org.fone.brons.facade.org.IEmpInfoService#loadById(java.lang.String)
	 */
	public Btf_emp_info loadById(String id) {
		return btf_emp_infoDao.loadById(id);
	}

}
