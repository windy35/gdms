package com.gdms.crud.bean;

public class Dbinfo {
    private Integer dbinfoid;

    private String studentid;

    private String dbtime;

    private String dbplace;

    private Float dbcj;

    private String pwzzxx;

    private String drpwxx;

    private String msxx;

    private String sypwxx;
    
    private Student student;
    
    @Override
	public String toString() {
		return "Dbinfo [dbinfoid=" + dbinfoid + ", studentid=" + studentid + ", dbtime=" + dbtime + ", dbplace="
				+ dbplace + ", dbcj=" + dbcj + ", pwzzxx=" + pwzzxx + ", drpwxx=" + drpwxx + ", msxx=" + msxx
				+ ", sypwxx=" + sypwxx + ", student=" + student + "]";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getDbinfoid() {
        return dbinfoid;
    }

    public void setDbinfoid(Integer dbinfoid) {
        this.dbinfoid = dbinfoid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getDbtime() {
        return dbtime;
    }

    public void setDbtime(String dbtime) {
        this.dbtime = dbtime == null ? null : dbtime.trim();
    }

    public String getDbplace() {
        return dbplace;
    }

    public void setDbplace(String dbplace) {
        this.dbplace = dbplace == null ? null : dbplace.trim();
    }

    public Float getDbcj() {
        return dbcj;
    }

    public void setDbcj(Float dbcj) {
        this.dbcj = dbcj;
    }

    public String getPwzzxx() {
        return pwzzxx;
    }

    public void setPwzzxx(String pwzzxx) {
        this.pwzzxx = pwzzxx == null ? null : pwzzxx.trim();
    }

    public String getDrpwxx() {
        return drpwxx;
    }

    public void setDrpwxx(String drpwxx) {
        this.drpwxx = drpwxx == null ? null : drpwxx.trim();
    }

    public String getMsxx() {
        return msxx;
    }

    public void setMsxx(String msxx) {
        this.msxx = msxx == null ? null : msxx.trim();
    }

    public String getSypwxx() {
        return sypwxx;
    }

    public void setSypwxx(String sypwxx) {
        this.sypwxx = sypwxx == null ? null : sypwxx.trim();
    }
}