package com.gdms.crud.dao;

import com.gdms.crud.bean.Auditstatustype;
import com.gdms.crud.bean.AuditstatustypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditstatustypeMapper {
    long countByExample(AuditstatustypeExample example);

    int deleteByExample(AuditstatustypeExample example);

    int deleteByPrimaryKey(Integer auditstatusid);

    int insert(Auditstatustype record);

    int insertSelective(Auditstatustype record);

    List<Auditstatustype> selectByExample(AuditstatustypeExample example);

    Auditstatustype selectByPrimaryKey(Integer auditstatusid);

    int updateByExampleSelective(@Param("record") Auditstatustype record, @Param("example") AuditstatustypeExample example);

    int updateByExample(@Param("record") Auditstatustype record, @Param("example") AuditstatustypeExample example);

    int updateByPrimaryKeySelective(Auditstatustype record);

    int updateByPrimaryKey(Auditstatustype record);
}