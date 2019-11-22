package com.gdms.crud.dao;

import com.gdms.crud.bean.Zqjcinfo;
import com.gdms.crud.bean.ZqjcinfoExample;
import com.gdms.crud.bean.ZqjcinfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZqjcinfoMapper {
    long countByExample(ZqjcinfoExample example);

    int deleteByExample(ZqjcinfoExample example);

    int deleteByPrimaryKey(Integer zqjcinfoid);

    int insert(ZqjcinfoWithBLOBs record);

    int insertSelective(ZqjcinfoWithBLOBs record);

    List<ZqjcinfoWithBLOBs> selectByExampleWithBLOBs(ZqjcinfoExample example);

    List<Zqjcinfo> selectByExample(ZqjcinfoExample example);

    ZqjcinfoWithBLOBs selectByPrimaryKey(Integer zqjcinfoid);

    int updateByExampleSelective(@Param("record") ZqjcinfoWithBLOBs record, @Param("example") ZqjcinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ZqjcinfoWithBLOBs record, @Param("example") ZqjcinfoExample example);

    int updateByExample(@Param("record") Zqjcinfo record, @Param("example") ZqjcinfoExample example);

    int updateByPrimaryKeySelective(ZqjcinfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ZqjcinfoWithBLOBs record);

    int updateByPrimaryKey(Zqjcinfo record);
}