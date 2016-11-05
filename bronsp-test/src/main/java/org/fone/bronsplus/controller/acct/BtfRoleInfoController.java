/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.fone.bronsplus.controller.acct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.fone.bronsplus.model.po.acct.BtfRoleInfo;
import org.fone.bronsp.base.WhereCondition;
import org.fone.bronsp.base.controller.BaseController;
import org.fone.bronsplus.biz.acct.BtfRoleInfoBiz;
import org.bronsp.common.util.AjaxUtils;
import org.bronsp.common.util.JSONUtils;
import org.fone.bronsp.base.controller.Page;

/**
 * <p>
 * auto genegrated
 * </p>
 */
@Controller
@RequestMapping(value = "/acct")
public class BtfRoleInfoController extends BaseController {
	
	@Autowired
	BtfRoleInfoBiz btfRoleInfoBiz;
	
	@RequestMapping(value = "/btfRoleInfo/edit")
	public String execute(ModelMap model, @RequestBody String content,
			String age, HttpServletRequest request, HttpServletResponse response) {
		try {
			JSONObject jsonObj = JSONObject.fromObject(content);
			JSONObject job = jsonObj.getJSONObject("item");
			BtfRoleInfo p = new BtfRoleInfo();
			JSONObject.toBean(job,p,jsonConfig);
			String id = sequenceBiz.generateId("BtfRoleInfo");
			if (StringUtils.isNotEmpty(p.getId())) {
				btfRoleInfoBiz.update(p);
			} else {
				p.setId(id);
				//initCreate(p, request);
				btfRoleInfoBiz.insert(p);
			}
			AjaxUtils.ajaxJson(response, JSONObject.fromObject(p).toString());
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "添加失败!");
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/btfRoleInfo/delete")
	public String execute3(ModelMap model, @RequestBody String content,
			String age, HttpServletRequest request, HttpServletResponse response) {
		try {
			JSONArray jsonArray = JSONArray.fromObject(content);
			List<BtfRoleInfo> list = new ArrayList<BtfRoleInfo>();
			for (int i = 0; i < jsonArray.size(); i++) {
				BtfRoleInfo p = new BtfRoleInfo();
				JSONObject.toBean(JSONObject.fromObject(jsonArray.get(i)),p,jsonConfig);
				list.add(p);
			}
			List<String> ids = new ArrayList<String>();
			for (BtfRoleInfo p : list) {
				ids.add(p.getId());
			}
			WhereCondition wc = new WhereCondition();
			wc.andIn("id", ids);
			btfRoleInfoBiz.deleteByCondition(wc);
			AjaxUtils.ajaxJson(response, "");
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "删除失败!");
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/btfRoleInfo/list")
	public String execute1(ModelMap model, @RequestBody String content,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			JSONObject jsonObj = JSONObject.fromObject(content);
			// 分页对象
			Page page = getPage(jsonObj);
			// 服务端排序规则
			String orderGuize = getOrderGuize(JSONUtils.getStr(jsonObj, "orderGuize"));
			// 组装查询条件
			WhereCondition wc = new WhereCondition();
			wc.setLength(page.getItemsperpage());
			wc.setOffset((page.getCurrentPage() - 1) * page.getItemsperpage());
			wc.setOrderBy(orderGuize);
			initWanNengChaXun(jsonObj, wc);// 万能查询
			List list = btfRoleInfoBiz.query(wc);
			JSONArray ja = JSONArray.fromObject(list,jsonConfig);
			page.setTotalItems(btfRoleInfoBiz.count(wc));
			Map map = new HashMap();
			map.put("page", page);
			map.put("list", ja);
			String s=JSONObject.fromObject(map,jsonConfig).toString();
			AjaxUtils.ajaxJson(response,s );
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "查询失败!");
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value = "/btfRoleInfo/list/id")
	public String executesd1(ModelMap model, @RequestBody String content,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			JSONObject jsonObj = JSONObject.fromObject(content);
			BtfRoleInfo k =  btfRoleInfoBiz.loadById(JSONUtils.getStr(jsonObj, "id"));
			JSONObject jo = JSONObject.fromObject(k,jsonConfig);
			AjaxUtils.ajaxJson(response, jo.toString());
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "查询失败!");
			e.printStackTrace();
		}
		return null;
	}
}
