package com.gdms.crud.bean;

public class Zdjlinfo {
    private Integer zdjlinfoid;

    private String title;

    private String zdsj;

    private String fjname;

    private String fjpath;

    private String uploadtime;

    private String lastalerttime;

    private String studentid;

    private Integer graduationdesignid;

    private String zygz;

    private GraduationdesignWithBLOBs graduationdesign;
    
    private Student student;
    
    @Override
	public String toString() {
		return "Zdjlinfo [zdjlinfoid=" + zdjlinfoid + ", title=" + title + ", zdsj=" + zdsj + ", fjname=" + fjname
				+ ", fjpath=" + fjpath + ", uploadtime=" + uploadtime + ", lastalerttime=" + lastalerttime
				+ ", studentid=" + studentid + ", graduationdesignid=" + graduationdesignid + ", zygz=" + zygz
				+ ", graduationdesign=" + graduationdesign + ", student=" + student + "]";
	}

	public GraduationdesignWithBLOBs getGraduationdesign() {
		return graduationdesign;
	}

	public void setGraduationdesign(GraduationdesignWithBLOBs graduationdesign) {
		this.graduationdesign = graduationdesign;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getZdjlinfoid() {
        return zdjlinfoid;
    }

    public void setZdjlinfoid(Integer zdjlinfoid) {
        this.zdjlinfoid = zdjlinfoid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getZdsj() {
        return zdsj;
    }

    public void setZdsj(String zdsj) {
        this.zdsj = zdsj == null ? null : zdsj.trim();
    }

    public String getFjname() {
        return fjname;
    }

    public void setFjname(String fjname) {
        this.fjname = fjname == null ? null : fjname.trim();
    }

    public String getFjpath() {
        return fjpath;
    }

    public void setFjpath(String fjpath) {
        this.fjpath = fjpath == null ? null : fjpath.trim();
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

    public String getZygz() {
        return zygz;
    }

    public void setZygz(String zygz) {
        this.zygz = zygz == null ? null : zygz.trim();
    }
}