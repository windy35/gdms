package com.gdms.crud.dao;

import com.gdms.crud.bean.Lyhdtitleinfo;
import com.gdms.crud.bean.LyhdtitleinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LyhdtitleinfoMapper {
    long countByExample(LyhdtitleinfoExample example);

    int deleteByExample(LyhdtitleinfoExample example);

    int deleteByPrimaryKey(Integer lyhdtitleinfoid);

    int insert(Lyhdtitleinfo record);

    int insertSelective(Lyhdtitleinfo record);

    List<Lyhdtitleinfo> selectByExampleWithBLOBs(LyhdtitleinfoExample example);

    List<Lyhdtitleinfo> selectByExample(LyhdtitleinfoExample example);

    Lyhdtitleinfo selectByPrimaryKey(Integer lyhdtitleinfoid);

    int updateByExampleSelective(@Param("record") Lyhdtitleinfo record, @Param("example") LyhdtitleinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Lyhdtitleinfo record, @Param("example") LyhdtitleinfoExample example);

    int updateByExample(@Param("record") Lyhdtitleinfo record, @Param("example") LyhdtitleinfoExample example);

    int updateByPrimaryKeySelective(Lyhdtitleinfo record);

    int updateByPrimaryKeyWithBLOBs(Lyhdtitleinfo record);

    int updateByPrimaryKey(Lyhdtitleinfo record);
}