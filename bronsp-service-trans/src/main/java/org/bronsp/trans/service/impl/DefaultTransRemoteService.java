/**
 * 
 */
package org.bronsp.trans.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.bronsp.trans.service.api.ITransService;
import org.bronsp.trans.service.dto.TransRequest;
import org.bronsp.trans.service.dto.TransResponse;

/**
 * 
 * 默认交易服务实现
 * 
 * @author megapro
 *
 */
public class DefaultTransRemoteService implements ITransService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.bronsp.service.api.trans.ITransService#doTrans(org.bronsp.service
	 * .api.trans.TransRequest)
	 */
	public TransResponse doTrans(TransRequest transRequest) {

		System.out.println("收到交易请求");
		System.out.println(transRequest.toString());

		TransResponse response = new TransResponse();
		response.setRetCode("00000");
		response.setRetMessage("交易处理成功");

		response.setRetData("{orgCode:\"123\",orgName:\"机构名\",delTime:\""
				+ genDateTime() + "\"}");
		return response;
	}

	private String genDateTime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmSSsss");
		return df.format(new Date());
	}

}
