/**
 * 
 */
package org.bronsp.trans.service.api;

import org.bronsp.trans.service.dto.TransRequest;
import org.bronsp.trans.service.dto.TransResponse;

/**
 * <pre>
 * 交易服务
 * 接受交易操作请求
 * 完成交易功能业务处理
 * </pre>
 * 
 * @author megapro
 *
 */
public interface ITransService {

	/**
	 * 处理交易
	 * @param transRequest 请求数据 
	 * @return 响应数据
	 */
	public TransResponse doTrans( TransRequest transRequest) ; 
}
