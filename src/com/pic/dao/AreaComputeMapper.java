package com.pic.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.pic.entity.AreaCompute;
import com.pic.entity.AreaComputeExample;

public interface AreaComputeMapper {
    int countByExample(AreaComputeExample example);

    int deleteByExample(AreaComputeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AreaCompute record);

    int insertSelective(AreaCompute record);

    List<AreaCompute> selectByExampleWithBLOBs(AreaComputeExample example);

    List<AreaCompute> selectByExample(AreaComputeExample example);

    AreaCompute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AreaCompute record, @Param("example") AreaComputeExample example);

    int updateByExampleWithBLOBs(@Param("record") AreaCompute record, @Param("example") AreaComputeExample example);

    int updateByExample(@Param("record") AreaCompute record, @Param("example") AreaComputeExample example);

    int updateByPrimaryKeySelective(AreaCompute record);

    int updateByPrimaryKeyWithBLOBs(AreaCompute record);

    int updateByPrimaryKey(AreaCompute record);
    
    List<Map<String,Object>> selectByCondition(Map<String,Object>map);
}