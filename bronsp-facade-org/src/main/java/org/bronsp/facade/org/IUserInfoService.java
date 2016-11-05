/**
 * 
 */
package org.bronsp.facade.org;

import java.util.List;

import org.bronsp.core.WhereCondition;
import org.fone.bronsp.org.model.po.Btf_user_info;

/**
 * @author megapro
 *
 */
public interface IUserInfoService {

	public void insert(Btf_user_info t);

	public void update(Btf_user_info t);

	public void updateForce(Btf_user_info t);

	public void delete(String id);

	public void deleteByCondition(WhereCondition wc);

	public void updateByCondition(WhereCondition wc, Btf_user_info t);

	public List<Btf_user_info> query(WhereCondition wc);

	public int count(WhereCondition wc);

	public Btf_user_info loadById(String id);
}
