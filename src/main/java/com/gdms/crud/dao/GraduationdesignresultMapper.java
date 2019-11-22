package com.gdms.crud.dao;

import com.gdms.crud.bean.Graduationdesignresult;
import com.gdms.crud.bean.GraduationdesignresultExample;
import com.gdms.crud.bean.GraduationdesignresultWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GraduationdesignresultMapper {
    long countByExample(GraduationdesignresultExample example);

    int deleteByExample(GraduationdesignresultExample example);

    int deleteByPrimaryKey(Integer graduationdesignresultid);

    int insert(GraduationdesignresultWithBLOBs record);

    int insertSelective(GraduationdesignresultWithBLOBs record);

    List<GraduationdesignresultWithBLOBs> selectByExampleWithBLOBs(GraduationdesignresultExample example);

    List<Graduationdesignresult> selectByExample(GraduationdesignresultExample example);

    GraduationdesignresultWithBLOBs selectByPrimaryKey(Integer graduationdesignresultid);

    int updateByExampleSelective(@Param("record") GraduationdesignresultWithBLOBs record, @Param("example") GraduationdesignresultExample example);

    int updateByExampleWithBLOBs(@Param("record") GraduationdesignresultWithBLOBs record, @Param("example") GraduationdesignresultExample example);

    int updateByExample(@Param("record") Graduationdesignresult record, @Param("example") GraduationdesignresultExample example);

    int updateByPrimaryKeySelective(GraduationdesignresultWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GraduationdesignresultWithBLOBs record);

    int updateByPrimaryKey(Graduationdesignresult record);
}