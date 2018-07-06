package com.pic.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pic.service.FarmService;
import com.pic.utils.FastJsonResult;
import com.pic.utils.StringUtil;

@Controller
@RequestMapping(value = "/gPSController")
public class GPSController {

	@Autowired
	private FarmService farmService;
	
	@RequestMapping(value = "/selectDate")
	@ResponseBody
	public FastJsonResult selectDate(HttpServletRequest request,HttpServletResponse response){
		response.setHeader("Access-Control-Allow-Origin", "*");
		 Map<String,Object> preMap = StringUtil.requestToMap(request.getParameterMap());
		return farmService.selectFarmDate(preMap);
	}
}
