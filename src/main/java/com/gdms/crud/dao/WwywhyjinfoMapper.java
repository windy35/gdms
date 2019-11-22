package com.gdms.crud.dao;

import com.gdms.crud.bean.Wwywhyjinfo;
import com.gdms.crud.bean.WwywhyjinfoExample;
import com.gdms.crud.bean.WwywhyjinfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WwywhyjinfoMapper {
    long countByExample(WwywhyjinfoExample example);

    int deleteByExample(WwywhyjinfoExample example);

    int deleteByPrimaryKey(Integer wwywyyjid);

    int insert(WwywhyjinfoWithBLOBs record);

    int insertSelective(WwywhyjinfoWithBLOBs record);

    List<WwywhyjinfoWithBLOBs> selectByExampleWithBLOBs(WwywhyjinfoExample example);

    List<Wwywhyjinfo> selectByExample(WwywhyjinfoExample example);

    WwywhyjinfoWithBLOBs selectByPrimaryKey(Integer wwywyyjid);

    int updateByExampleSelective(@Param("record") WwywhyjinfoWithBLOBs record, @Param("example") WwywhyjinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") WwywhyjinfoWithBLOBs record, @Param("example") WwywhyjinfoExample example);

    int updateByExample(@Param("record") Wwywhyjinfo record, @Param("example") WwywhyjinfoExample example);

    int updateByPrimaryKeySelective(WwywhyjinfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WwywhyjinfoWithBLOBs record);

    int updateByPrimaryKey(Wwywhyjinfo record);
}