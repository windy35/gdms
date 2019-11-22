package com.gdms.crud.dao;

import com.gdms.crud.bean.Titlesource;
import com.gdms.crud.bean.TitlesourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TitlesourceMapper {
    long countByExample(TitlesourceExample example);

    int deleteByExample(TitlesourceExample example);

    int deleteByPrimaryKey(Integer titlesourceid);

    int insert(Titlesource record);

    int insertSelective(Titlesource record);

    List<Titlesource> selectByExample(TitlesourceExample example);

    Titlesource selectByPrimaryKey(Integer titlesourceid);

    int updateByExampleSelective(@Param("record") Titlesource record, @Param("example") TitlesourceExample example);

    int updateByExample(@Param("record") Titlesource record, @Param("example") TitlesourceExample example);

    int updateByPrimaryKeySelective(Titlesource record);

    int updateByPrimaryKey(Titlesource record);
}