package com.gdms.crud.dao;

import com.gdms.crud.bean.Dbinfo;
import com.gdms.crud.bean.DbinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbinfoMapper {
    long countByExample(DbinfoExample example);

    int deleteByExample(DbinfoExample example);

    int deleteByPrimaryKey(Integer dbinfoid);

    int insert(Dbinfo record);

    int insertSelective(Dbinfo record);

    List<Dbinfo> selectByExample(DbinfoExample example);

    Dbinfo selectByPrimaryKey(Integer dbinfoid);

    int updateByExampleSelective(@Param("record") Dbinfo record, @Param("example") DbinfoExample example);

    int updateByExample(@Param("record") Dbinfo record, @Param("example") DbinfoExample example);

    int updateByPrimaryKeySelective(Dbinfo record);

    int updateByPrimaryKey(Dbinfo record);
}