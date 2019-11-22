package com.gdms.crud.bean;

public class Dbpptinfo {
    private Integer dbpptinfoid;

    private String title;

    private String fjname;

    private String fjpath;

    private String uploadtime;

    private String lastalerttime;

    private String studentid;

    private Integer graduationdesignid;

    private String nrzy;

    private Student student;
    
    private GraduationdesignWithBLOBs graduationdesign;
    
	@Override
	public String toString() {
		return "Dbpptinfo [dbpptinfoid=" + dbpptinfoid + ", title=" + title + ", fjname=" + fjname + ", fjpath="
				+ fjpath + ", uploadtime=" + uploadtime + ", lastalerttime=" + lastalerttime + ", studentid="
				+ studentid + ", graduationdesignid=" + graduationdesignid + ", nrzy=" + nrzy + ", student=" + student
				+ ", graduationdesign=" + graduationdesign + "]";
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

	public Integer getDbpptinfoid() {
        return dbpptinfoid;
    }

    public void setDbpptinfoid(Integer dbpptinfoid) {
        this.dbpptinfoid = dbpptinfoid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public String getNrzy() {
        return nrzy;
    }

    public void setNrzy(String nrzy) {
        this.nrzy = nrzy == null ? null : nrzy.trim();
    }
}