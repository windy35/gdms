package com.gdms.crud.dao;

import com.gdms.crud.bean.Teachernotice;
import com.gdms.crud.bean.TeachernoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachernoticeMapper {
    long countByExample(TeachernoticeExample example);

    int deleteByExample(TeachernoticeExample example);

    int deleteByPrimaryKey(Integer noticeid);

    int insert(Teachernotice record);

    int insertSelective(Teachernotice record);

    List<Teachernotice> selectByExampleWithBLOBs(TeachernoticeExample example);

    List<Teachernotice> selectByExample(TeachernoticeExample example);

    Teachernotice selectByPrimaryKey(Integer noticeid);

    int updateByExampleSelective(@Param("record") Teachernotice record, @Param("example") TeachernoticeExample example);

    int updateByExampleWithBLOBs(@Param("record") Teachernotice record, @Param("example") TeachernoticeExample example);

    int updateByExample(@Param("record") Teachernotice record, @Param("example") TeachernoticeExample example);

    int updateByPrimaryKeySelective(Teachernotice record);

    int updateByPrimaryKeyWithBLOBs(Teachernotice record);

    int updateByPrimaryKey(Teachernotice record);
}