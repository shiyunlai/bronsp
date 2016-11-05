/**
 * 
 */
package org.fone.bronsp.base.biz;

import org.bronsp.common.util.SimpleSequenceUtil;
import org.springframework.stereotype.Service;

/**
 * 
 * 序号相关业务逻辑
 * 
 * @author megapro
 *
 */
@Service
public class SequenceBiz {

	/**
	 * 
	 * 获取一个唯一id字符串
	 * 
	 * @return
	 * 	当前秒 ＋ 四位顺序号(一秒内不重复)
	 */
	public String getId(){
		return System.currentTimeMillis() + "" + SimpleSequenceUtil.instance.getSeqNo() ; 
	}
	
	/**
	 * 获取带有获取者信息的唯一id字符串
	 * @param gainer 获取者信息
	 * @return 
	 */
	public String generateId(String gainer){
		return gainer + getId() ; 
	}
	
}
