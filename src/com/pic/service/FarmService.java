package com.pic.service;

import java.util.Map;

import com.pic.entity.FarmMachine;
import com.pic.utils.FastJsonResult;

public interface FarmService {
	FastJsonResult selectFarmDate(Map<String,Object> preMap);
	FarmMachine selectFMCondition(Map<String,Object> perMap);
}
