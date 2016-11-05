/**
 * 
 */
package org.bronsp.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bronsp.trans.service.api.ITransService;
import org.bronsp.trans.service.dto.TransData;
import org.bronsp.trans.service.dto.TransRequest;
import org.bronsp.trans.service.dto.TransResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * 交易操作处理服务controller
 * 
 * @author megapro
 *
 */

@Controller
@RequestMapping("/trans") 
public class TransController {

	@Autowired
	ITransService transService ; 
	
	@RequestMapping(value="/commit",method=RequestMethod.GET)
	@ResponseBody
	public String doCommitTrans(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("收到交易操作请求:"+request.getParameter("content"));
		
		TransRequest transRequest = new TransRequest() ; 
		transRequest.setChannelId("TWS");
		transRequest.setTransCode("TX12345");
		transRequest.setFunCode("commitTx");
		TransData transData = new TransData() ; 
		transData.addFieldValue("field_1", "value 1");
		transData.addFieldValue("field_2", "value 2");
		transData.addFieldValue("field_long", 8878L);
		transRequest.setTransData(transData);
		System.out.println("请求数据:"+transRequest.toString());
		TransResponse transResponse = transService.doTrans(transRequest) ;
		System.out.println("处理响应:\n"+transResponse.toString());
		return null ; 
	}
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String doTest(
			@RequestParam(value = "content", required = false) String a,
			ModelMap model, HttpServletRequest request,
			HttpServletResponse response) {
		
		System.out.println("收到交易操作请求:" + a);
		return null;
	}
	
	
}
