package com.gdms.crud.bean;

public class Lyhdtitleinfo {
    private Integer lyhdtitleinfoid;

    private String title;

    private String studentid;

    private String submittime;

    private Integer typeid;

    private String instructorid;

    private String context;

    private Student student;
    

	@Override
	public String toString() {
		return "Lyhdtitleinfo [lyhdtitleinfoid=" + lyhdtitleinfoid + ", title=" + title + ", studentid=" + studentid
				+ ", submittime=" + submittime + ", typeid=" + typeid + ", instructorid=" + instructorid + ", context="
				+ context + ", student=" + student + "]";
	}
	
    public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getLyhdtitleinfoid() {
        return lyhdtitleinfoid;
    }

    public void setLyhdtitleinfoid(Integer lyhdtitleinfoid) {
        this.lyhdtitleinfoid = lyhdtitleinfoid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getSubmittime() {
        return submittime;
    }

    public void setSubmittime(String submittime) {
        this.submittime = submittime == null ? null : submittime.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getInstructorid() {
        return instructorid;
    }

    public void setInstructorid(String instructorid) {
        this.instructorid = instructorid == null ? null : instructorid.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}