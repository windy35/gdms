package com.gdms.crud.dao;

import com.gdms.crud.bean.Graduationdesign;
import com.gdms.crud.bean.GraduationdesignExample;
import com.gdms.crud.bean.GraduationdesignWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GraduationdesignMapper {
    long countByExample(GraduationdesignExample example);

    int deleteByExample(GraduationdesignExample example);

    int deleteByPrimaryKey(Integer graduationdesignid);

    int insert(GraduationdesignWithBLOBs record);

    int insertSelective(GraduationdesignWithBLOBs record);

    List<GraduationdesignWithBLOBs> selectByExampleWithBLOBs(GraduationdesignExample example);

    List<Graduationdesign> selectByExample(GraduationdesignExample example);

    GraduationdesignWithBLOBs selectByPrimaryKey(Integer graduationdesignid);

    int updateByExampleSelective(@Param("record") GraduationdesignWithBLOBs record, @Param("example") GraduationdesignExample example);

    int updateByExampleWithBLOBs(@Param("record") GraduationdesignWithBLOBs record, @Param("example") GraduationdesignExample example);

    int updateByExample(@Param("record") Graduationdesign record, @Param("example") GraduationdesignExample example);

    int updateByPrimaryKeySelective(GraduationdesignWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GraduationdesignWithBLOBs record);

    int updateByPrimaryKey(Graduationdesign record);
}