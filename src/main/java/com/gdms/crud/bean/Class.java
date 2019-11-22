package com.gdms.crud.bean;

public class Class {
    private Integer classid;

    private Integer departmentid;

    private Integer majorid;

    private String classname;

    private Major major;       
    
    private Department department;
    
    @Override
	public String toString() {
		return "Class [classid=" + classid + ", departmentid=" + departmentid + ", majorid=" + majorid + ", classname="
				+ classname + ", major=" + major + ", department=" + department + "]";
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }
}