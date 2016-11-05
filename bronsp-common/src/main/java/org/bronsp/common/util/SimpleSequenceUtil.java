/**
 * 
 */
package org.bronsp.common.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <pre>
 * 序号工具的简单实现
 * 适用于非分布式部署情况，
 * 因为是以自然秒为依据取id值，因此分布式部署时不能确保获取的id号不重复。
 * </pre>
 * @author megapro
 *
 */
public class SimpleSequenceUtil {

	public static final SimpleSequenceUtil instance = new SimpleSequenceUtil() ; 
	
	private  static int i=0;
	private  static int maxSeqNo = 1000 ; 
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

	private SimpleSequenceUtil(){
	}
	
	/**
	 * 循环返回不大于 maxSeqNo 的数字
	 * @return
	 */
	private synchronized int getSeq(){
		i++;
		if( i>=maxSeqNo ){
			i=1;
		}
		int a = i+maxSeqNo;
		return a;
	}
	
	/**
	 * <pre>
	 * 获取唯一id
	 * 规则： 当前秒 ＋ 四位顺序号
	 * 说明： 每秒内有 9999 个不重复id可用
	 * </pre>
	 * @return
	 */
	public String getId(){
		
		return System.currentTimeMillis()+""+getSeq();
	}
	
	/**
	 * <pre>
	 * 获得当前秒内的序号SeqNo
	 * 不保证返回值在分布式系统中的唯一性
	 * </pre>
	 * @return
	 */
	public int getSeqNo(){
		return getSeq() ;
	}
	
	/**
	 * merNO+yyyymmdd+10位一天内不能重复的数字。
	 * @param merNO
	 * @return
	 */
	public synchronized String getWxOrderNO(String merNO){
		String a=merNO+sdf.format(new Date())+((System.currentTimeMillis()+"").substring(3));
		return a;
	}
}
