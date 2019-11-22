package com.gdms.crud.bean;

public class Bylwinfo {
    private Integer bylwinfoid;

    private String bylwfjname;

    private String bylwfjpath;

    private String qtfjname;

    private String qtfjpath;

    private String uploadtime;

    private String lastalerttime;

    private String studentid;

    private Integer graduationdesignid;

    private Student student;
    
    private GraduationdesignWithBLOBs graduationdesign;
    
	@Override
	public String toString() {
		return "Bylwinfo [bylwinfoid=" + bylwinfoid + ", bylwfjname=" + bylwfjname + ", bylwfjpath=" + bylwfjpath
				+ ", qtfjname=" + qtfjname + ", qtfjpath=" + qtfjpath + ", uploadtime=" + uploadtime
				+ ", lastalerttime=" + lastalerttime + ", studentid=" + studentid + ", graduationdesignid="
				+ graduationdesignid + ", student=" + student + ", graduationdesign=" + graduationdesign + "]";
	}

	public GraduationdesignWithBLOBs getGraduationdesign() {
		return graduationdesign;
	}

	public void setGraduationdesign(GraduationdesignWithBLOBs graduationdesign) {
		this.graduationdesign = graduationdesign;
	}

	public Integer getBylwinfoid() {
		return bylwinfoid;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}



    public void setBylwinfoid(Integer bylwinfoid) {
        this.bylwinfoid = bylwinfoid;
    }

    public String getBylwfjname() {
        return bylwfjname;
    }

    public void setBylwfjname(String bylwfjname) {
        this.bylwfjname = bylwfjname == null ? null : bylwfjname.trim();
    }

    public String getBylwfjpath() {
        return bylwfjpath;
    }

    public void setBylwfjpath(String bylwfjpath) {
        this.bylwfjpath = bylwfjpath == null ? null : bylwfjpath.trim();
    }

    public String getQtfjname() {
        return qtfjname;
    }

    public void setQtfjname(String qtfjname) {
        this.qtfjname = qtfjname == null ? null : qtfjname.trim();
    }

    public String getQtfjpath() {
        return qtfjpath;
    }

    public void setQtfjpath(String qtfjpath) {
        this.qtfjpath = qtfjpath == null ? null : qtfjpath.trim();
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