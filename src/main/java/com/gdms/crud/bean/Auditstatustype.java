package com.gdms.crud.bean;

public class Auditstatustype {
    private Integer auditstatusid;

    private String auditstatusname;

    @Override
	public String toString() {
		return "Auditstatustype [auditstatusid=" + auditstatusid + ", auditstatusname=" + auditstatusname + "]";
	}

	public Integer getAuditstatusid() {
        return auditstatusid;
    }

    public void setAuditstatusid(Integer auditstatusid) {
        this.auditstatusid = auditstatusid;
    }

    public String getAuditstatusname() {
        return auditstatusname;
    }

    public void setAuditstatusname(String auditstatusname) {
        this.auditstatusname = auditstatusname == null ? null : auditstatusname.trim();
    }
}