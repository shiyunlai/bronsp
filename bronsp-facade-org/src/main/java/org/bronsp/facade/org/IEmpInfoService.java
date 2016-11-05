/**
 * 
 */
package org.bronsp.facade.org;

import java.util.List;

import org.bronsp.core.WhereCondition;
import org.fone.bronsp.org.model.po.Btf_emp_info;

/**
 * @author megapro
 *
 */
public interface IEmpInfoService {

	public void insert(Btf_emp_info t);
    
    public void update(Btf_emp_info t);
   
    public void updateForce(Btf_emp_info t);
   
    public void delete(String id);
   
    public void deleteByCondition(WhereCondition wc);
	
	public void updateByCondition(WhereCondition wc,Btf_emp_info t);
	
    public List<Btf_emp_info> query(WhereCondition wc);
    
    public int count(WhereCondition wc);
   
    public Btf_emp_info loadById(String id);
    
}
