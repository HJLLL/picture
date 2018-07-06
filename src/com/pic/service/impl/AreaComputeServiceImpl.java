package com.pic.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pic.dao.AreaComputeMapper;
import com.pic.service.AreaComputeService;

@Service
public class AreaComputeServiceImpl implements AreaComputeService{

	@Autowired
	private AreaComputeMapper areaComputeMapper;

	@Override
	public List<Map<String, Object>> selectDataByCondition(Map<String, Object> map) {
		return areaComputeMapper.selectByCondition(map);
	}
	
}
