package com.gdms.crud.dao;

import com.gdms.crud.bean.Designtype;
import com.gdms.crud.bean.DesigntypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DesigntypeMapper {
    long countByExample(DesigntypeExample example);

    int deleteByExample(DesigntypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Designtype record);

    int insertSelective(Designtype record);

    List<Designtype> selectByExample(DesigntypeExample example);

    Designtype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Designtype record, @Param("example") DesigntypeExample example);

    int updateByExample(@Param("record") Designtype record, @Param("example") DesigntypeExample example);

    int updateByPrimaryKeySelective(Designtype record);

    int updateByPrimaryKey(Designtype record);
}