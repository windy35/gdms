package com.gdms.crud.dao;

import com.gdms.crud.bean.Ktbginfo;
import com.gdms.crud.bean.KtbginfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KtbginfoMapper {
    long countByExample(KtbginfoExample example);

    int deleteByExample(KtbginfoExample example);

    int deleteByPrimaryKey(Integer ktbginfoid);

    int insert(Ktbginfo record);

    int insertSelective(Ktbginfo record);

    List<Ktbginfo> selectByExampleWithBLOBs(KtbginfoExample example);

    List<Ktbginfo> selectByExample(KtbginfoExample example);

    Ktbginfo selectByPrimaryKey(Integer ktbginfoid);

    int updateByExampleSelective(@Param("record") Ktbginfo record, @Param("example") KtbginfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Ktbginfo record, @Param("example") KtbginfoExample example);

    int updateByExample(@Param("record") Ktbginfo record, @Param("example") KtbginfoExample example);

    int updateByPrimaryKeySelective(Ktbginfo record);

    int updateByPrimaryKeyWithBLOBs(Ktbginfo record);

    int updateByPrimaryKey(Ktbginfo record);
}