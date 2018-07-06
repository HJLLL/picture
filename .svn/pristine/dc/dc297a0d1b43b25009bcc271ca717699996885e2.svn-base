package com.pic.dao;

import com.pic.entity.DBs;
import com.pic.entity.DBsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DBsMapper {
    int countByExample(DBsExample example);

    int deleteByExample(DBsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DBs record);

    int insertSelective(DBs record);

    List<DBs> selectByExample(DBsExample example);

    DBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DBs record, @Param("example") DBsExample example);

    int updateByExample(@Param("record") DBs record, @Param("example") DBsExample example);

    int updateByPrimaryKeySelective(DBs record);

    int updateByPrimaryKey(DBs record);
    /**
     * 查询数据库以db_开头的表名
     * @return
     */
    List<String> selectDBTableName();
    /**
     * 查询一段时间的gps
     * @param map
     * @return
     */
    List<Map<String,Object>> selectGPSByTime(Map<String,Object> map);
}