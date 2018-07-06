package com.pic.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pic.dao.DemoMapper;
import com.pic.entity.Demo;
import com.pic.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{

	@Autowired
	private DemoMapper demoMapper;
	
	@Override
	public Demo selectDemo() {
		// TODO Auto-generated method stub
		return demoMapper.selectByPrimaryKey(1);
	}

}
