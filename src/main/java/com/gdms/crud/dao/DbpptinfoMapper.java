package com.gdms.crud.dao;

import com.gdms.crud.bean.Dbpptinfo;
import com.gdms.crud.bean.DbpptinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbpptinfoMapper {
    long countByExample(DbpptinfoExample example);

    int deleteByExample(DbpptinfoExample example);

    int deleteByPrimaryKey(Integer dbpptinfoid);

    int insert(Dbpptinfo record);

    int insertSelective(Dbpptinfo record);

    List<Dbpptinfo> selectByExampleWithBLOBs(DbpptinfoExample example);

    List<Dbpptinfo> selectByExample(DbpptinfoExample example);

    Dbpptinfo selectByPrimaryKey(Integer dbpptinfoid);

    int updateByExampleSelective(@Param("record") Dbpptinfo record, @Param("example") DbpptinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Dbpptinfo record, @Param("example") DbpptinfoExample example);

    int updateByExample(@Param("record") Dbpptinfo record, @Param("example") DbpptinfoExample example);

    int updateByPrimaryKeySelective(Dbpptinfo record);

    int updateByPrimaryKeyWithBLOBs(Dbpptinfo record);

    int updateByPrimaryKey(Dbpptinfo record);
}