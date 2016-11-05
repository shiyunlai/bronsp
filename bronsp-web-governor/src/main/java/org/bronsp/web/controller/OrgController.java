package org.bronsp.web.controller ; 

import org.apache.commons.lang.ObjectUtils;
import org.bronsp.facade.org.IEmpInfoService;
import org.bronsp.facade.org.IOrgInfoService;
import org.bronsp.facade.org.IUserInfoService;
import org.fone.bronsp.org.model.dto.OrgInfoDto;
import org.fone.bronsp.org.model.po.Btf_org_info;
import org.fone.bronsp.org.model.po.Btf_user_info;
import org.fone.bronsp.org.service.OrgRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.demo.bid.BidRequest;
import com.alibaba.dubbo.demo.bid.BidResponse;
import com.alibaba.dubbo.demo.bid.BidService;

/**
 * 
 */

/**
 * 组织机构功能相关的controller
 * @author megapro
 *
 */

@Controller
@RequestMapping("/org")
public class OrgController {
	
	@Autowired
	private OrgRemoteService orgRemoteService ; 
	
	@Autowired
	private IOrgInfoService orgInfoService;

	@Autowired
	private IEmpInfoService empInfoService;
	
	@Autowired
	private IUserInfoService userInfoService;
	
	@Autowired
	private BidService bidService;
	
	private static final Logger logger = LoggerFactory.getLogger(OrgController.class) ;
	
	
	@RequestMapping(value = "/bid")
	@ResponseBody
	public void callBidService(){
		
		System.out.println("here in  callBidService");
		
		BidRequest request = new BidRequest() ; 
		request .setId("123123");
		BidResponse response = bidService.bid(request) ;
		System.out.println(" response bidservice is : " + response.getId());
	}
	
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public void callTest(){
		
		/*
		 * 新插入一条 机构
		 * 然后查询出来
		 */
		System.out.println("here in  callTest");
		Btf_org_info t = new Btf_org_info() ; 
		String id = "SYL:"+Long.valueOf(System.currentTimeMillis()).toString() ; 
		t.setId(id);
		t.setOrg_code(id+"CODE");
		t.setOrg_name("机构名称");
		orgInfoService.insert(t);
		
		Btf_org_info o = orgInfoService.loadById(id) ;
		if( ! ObjectUtils.equals(o, null) ){
			System.out.println("loadByid end : id = "+o.getId()+" org_code is = " + o.getOrg_code());
		}else{
			System.out.println("not found org by id : "+id) ; 
		}
	}
	
	@RequestMapping(value = "/user")
	@ResponseBody
	public String getUserById(@RequestParam(value = "id",defaultValue = "") String id){
		
		logger.debug("here in  getUserById , id is : " + id);
		StringBuffer sb = new StringBuffer();
		Btf_user_info user = userInfoService.loadById(id) ; 
		String res = net.sf.json.JSONObject.fromObject(user).toString() ;
		logger.debug("result is : " + res);
		
		return res;
	}
	
	
	/**
	 * 添加机构
	 * @param model
	 * @param content
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value ="/add")
	@ResponseBody
	public String addOrg(){
		
		OrgInfoDto dto = new OrgInfoDto() ; 
		String orgCode = orgRemoteService.genOrgCode() ; 
		System.out.println("gen code = " + orgCode );
		
		dto.setOrg_code(orgCode);
		dto.setOrg_name("机构名称"+orgCode);
		
		Btf_org_info org = orgRemoteService.addOrgInfo(dto) ; 
		
		Btf_org_info backOrg = orgRemoteService.queryOrgInfoById(org.getId()) ;
		
		System.out.println("code = "+backOrg.getOrg_code()+" name = " + backOrg.getOrg_name() );
		
		return "" ;
	}
	
}
