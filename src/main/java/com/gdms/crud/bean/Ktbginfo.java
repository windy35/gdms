package com.gdms.crud.bean;

public class Ktbginfo {
    private Integer ktbginfoid;

    private String ktbgfjname;

    private String ktbgpath;

    private String studentid;

    private Integer graduationdesignid;

    private Integer graduationdesignresultid;

    private String uploadtime;

    private String lastalerttime;

    private String ktbgdetail;

    private Graduationdesign graduationdesign;
    
    private Graduationdesignresult graduationdesignresult;       
    
    private Student student;
    
    public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Ktbginfo [ktbginfoid=" + ktbginfoid + ", ktbgfjname=" + ktbgfjname + ", ktbgpath=" + ktbgpath
				+ ", studentid=" + studentid + ", graduationdesignid=" + graduationdesignid
				+ ", graduationdesignresultid=" + graduationdesignresultid + ", uploadtime=" + uploadtime
				+ ", lastalerttime=" + lastalerttime + ", ktbgdetail=" + ktbgdetail + ", graduationdesign="
				+ graduationdesign + ", graduationdesignresult=" + graduationdesignresult + "]";
	}

	public Graduationdesign getGraduationdesign() {
		return graduationdesign;
	}

	public void setGraduationdesign(Graduationdesign graduationdesign) {
		this.graduationdesign = graduationdesign;
	}

	public Graduationdesignresult getGraduationdesignresult() {
		return graduationdesignresult;
	}

	public void setGraduationdesignresult(Graduationdesignresult graduationdesignresult) {
		this.graduationdesignresult = graduationdesignresult;
	}

	public Integer getKtbginfoid() {
        return ktbginfoid;
    }

    public void setKtbginfoid(Integer ktbginfoid) {
        this.ktbginfoid = ktbginfoid;
    }

    public String getKtbgfjname() {
        return ktbgfjname;
    }

    public void setKtbgfjname(String ktbgfjname) {
        this.ktbgfjname = ktbgfjname == null ? null : ktbgfjname.trim();
    }

    public String getKtbgpath() {
        return ktbgpath;
    }

    public void setKtbgpath(String ktbgpath) {
        this.ktbgpath = ktbgpath == null ? null : ktbgpath.trim();
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

    public Integer getGraduationdesignresultid() {
        return graduationdesignresultid;
    }

    public void setGraduationdesignresultid(Integer graduationdesignresultid) {
        this.graduationdesignresultid = graduationdesignresultid;
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

    public String getKtbgdetail() {
        return ktbgdetail;
    }

    public void setKtbgdetail(String ktbgdetail) {
        this.ktbgdetail = ktbgdetail == null ? null : ktbgdetail.trim();
    }
}