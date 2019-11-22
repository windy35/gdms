package com.gdms.crud.dao;

import com.gdms.crud.bean.Zdjlinfo;
import com.gdms.crud.bean.ZdjlinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZdjlinfoMapper {
    long countByExample(ZdjlinfoExample example);

    int deleteByExample(ZdjlinfoExample example);

    int deleteByPrimaryKey(Integer zdjlinfoid);

    int insert(Zdjlinfo record);

    int insertSelective(Zdjlinfo record);

    List<Zdjlinfo> selectByExampleWithBLOBs(ZdjlinfoExample example);

    List<Zdjlinfo> selectByExample(ZdjlinfoExample example);

    Zdjlinfo selectByPrimaryKey(Integer zdjlinfoid);

    int updateByExampleSelective(@Param("record") Zdjlinfo record, @Param("example") ZdjlinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Zdjlinfo record, @Param("example") ZdjlinfoExample example);

    int updateByExample(@Param("record") Zdjlinfo record, @Param("example") ZdjlinfoExample example);

    int updateByPrimaryKeySelective(Zdjlinfo record);

    int updateByPrimaryKeyWithBLOBs(Zdjlinfo record);

    int updateByPrimaryKey(Zdjlinfo record);
}