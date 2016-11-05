/**
 * 
 */
package org.bronsp.facade.org;

import java.util.List;

import org.bronsp.core.WhereCondition;
import org.fone.bronsp.org.model.po.Btf_org_info;

/**
 * 
 * dubbo服务接口： 机构信息服务
 * 
 * @author megapro
 *
 */
public interface IOrgInfoService {
	
    public void insert(Btf_org_info t);
    
    public void update(Btf_org_info t);
   
    public void updateForce(Btf_org_info t);
   
    public void delete(String id);
   
    public void deleteByCondition(WhereCondition wc);
	
	public void updateByCondition(WhereCondition wc,Btf_org_info t);
	
    public List<Btf_org_info> query(WhereCondition wc);
    
    public int count(WhereCondition wc);
    
    public Btf_org_info loadById(String id);

}
