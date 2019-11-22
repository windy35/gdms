package com.gdms.crud.dao;

import com.gdms.crud.bean.Bylwinfo;
import com.gdms.crud.bean.BylwinfoExample;
import com.gdms.crud.bean.BylwinfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BylwinfoMapper {
    long countByExample(BylwinfoExample example);

    int deleteByExample(BylwinfoExample example);

    int deleteByPrimaryKey(Integer bylwinfoid);

    int insert(BylwinfoWithBLOBs record);

    int insertSelective(BylwinfoWithBLOBs record);

    List<BylwinfoWithBLOBs> selectByExampleWithBLOBs(BylwinfoExample example);

    List<Bylwinfo> selectByExample(BylwinfoExample example);

    BylwinfoWithBLOBs selectByPrimaryKey(Integer bylwinfoid);

    int updateByExampleSelective(@Param("record") BylwinfoWithBLOBs record, @Param("example") BylwinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") BylwinfoWithBLOBs record, @Param("example") BylwinfoExample example);

    int updateByExample(@Param("record") Bylwinfo record, @Param("example") BylwinfoExample example);

    int updateByPrimaryKeySelective(BylwinfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BylwinfoWithBLOBs record);

    int updateByPrimaryKey(Bylwinfo record);
}