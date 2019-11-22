package com.gdms.crud.bean;

public class Department {
    private Integer departmentid;

    private String departmentname;

    public Department(Integer departmentid, String departmentname) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
	}

	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname + "]";
	}

	public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }
}