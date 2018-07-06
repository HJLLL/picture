package com.pic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pic.entity.Demo;
import com.pic.service.DemoService;

@Controller
@RequestMapping(value = "/demoController")
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@ResponseBody
    @RequestMapping(value = "/selectDemo")
	public Demo	selectDemo(){
		Demo demo = demoService.selectDemo();
		System.out.println(demo.getName());
		return demo;
	}
}
