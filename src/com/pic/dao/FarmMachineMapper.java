package com.pic.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.pic.entity.FarmMachine;
import com.pic.entity.FarmMachineExample;

public interface FarmMachineMapper {
    int countByExample(FarmMachineExample example);

    int deleteByExample(FarmMachineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FarmMachine record);

    int insertSelective(FarmMachine record);

    List<FarmMachine> selectByExample(FarmMachineExample example);

    FarmMachine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FarmMachine record, @Param("example") FarmMachineExample example);

    int updateByExample(@Param("record") FarmMachine record, @Param("example") FarmMachineExample example);

    int updateByPrimaryKeySelective(FarmMachine record);

    int updateByPrimaryKey(FarmMachine record);
    
    FarmMachine selectFMByCondition(Map<String,Object>map);
}