package com.gdms.crud.bean;

public class Wwywhyjinfo {
    private Integer wwywyyjid;

    private String wwfjname;

    private String wwfjpath;

    private String ywfjname;

    private String ywfjpath;

    private String uploadtime;

    private String lastalerttime;

    private String studentid;

    private Integer graduationdesignid;

    private Student student;
    
    private GraduationdesignWithBLOBs graduationdesign;
    
    @Override
	public String toString() {
		return "Wwywhyjinfo [wwywyyjid=" + wwywyyjid + ", wwfjname=" + wwfjname + ", wwfjpath=" + wwfjpath
				+ ", ywfjname=" + ywfjname + ", ywfjpath=" + ywfjpath + ", uploadtime=" + uploadtime
				+ ", lastalerttime=" + lastalerttime + ", studentid=" + studentid + ", graduationdesignid="
				+ graduationdesignid + ", student=" + student + ", graduationdesign=" + graduationdesign + "]";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public GraduationdesignWithBLOBs getGraduationdesign() {
		return graduationdesign;
	}

	public void setGraduationdesign(GraduationdesignWithBLOBs graduationdesign) {
		this.graduationdesign = graduationdesign;
	}

	public Integer getWwywyyjid() {
        return wwywyyjid;
    }

    public void setWwywyyjid(Integer wwywyyjid) {
        this.wwywyyjid = wwywyyjid;
    }

    public String getWwfjname() {
        return wwfjname;
    }

    public void setWwfjname(String wwfjname) {
        this.wwfjname = wwfjname == null ? null : wwfjname.trim();
    }

    public String getWwfjpath() {
        return wwfjpath;
    }

    public void setWwfjpath(String wwfjpath) {
        this.wwfjpath = wwfjpath == null ? null : wwfjpath.trim();
    }

    public String getYwfjname() {
        return ywfjname;
    }

    public void setYwfjname(String ywfjname) {
        this.ywfjname = ywfjname == null ? null : ywfjname.trim();
    }

    public String getYwfjpath() {
        return ywfjpath;
    }

    public void setYwfjpath(String ywfjpath) {
        this.ywfjpath = ywfjpath == null ? null : ywfjpath.trim();
    }

    public String getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(String uploadtime) {
        this.uploadtime = uploadtime == null ? null : uploadtime.trim();
    }

    public String getLastalerttime() {
        return lastalerttime;
    }

    public void setLastalerttime(String lastalerttime) {
        this.lastalerttime = lastalerttime == null ? null : lastalerttime.trim();
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public Integer getGraduationdesignid() {
        return graduationdesignid;
    }

    public void setGraduationdesignid(Integer graduationdesignid) {
        this.graduationdesignid = graduationdesignid;
    }
}