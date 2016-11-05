/**
 * 
 */
package org.bronsp.trans.service.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 交易数据
 * 
 * @author megapro
 *
 */
public class TransData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 610767108076395886L;

	private Map<String, String> transDatas = new HashMap<String, String>();

	public Object getFieldValue(String fieldName) {
		return this.transDatas.get(fieldName);
	}
	
	public void addFieldValue(String fieldName, String stringValue) {
		this.transDatas.put(fieldName, stringValue);
	}
	
	public void addFieldValue(String fieldName, Long longValue) {
		this.transDatas.put(fieldName, longValue.toString());
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer() ; 
		Set<Entry<String, String>> set = transDatas.entrySet() ; 
		Iterator<Entry<String, String>> it = set.iterator() ; 
		while( it.hasNext() ){
			Entry<String, String> e = it.next() ; 
			sb.append(e.getKey()).append("=").append(e.getValue()).append("\n") ;
		}
		return sb.toString() ; 
	}
}
