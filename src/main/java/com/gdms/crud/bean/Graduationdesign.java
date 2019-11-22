package com.gdms.crud.bean;

public class Graduationdesign {
    private Integer graduationdesignid;

    private String title;

    private Integer departmentid;

    private String instructorid;

    private Integer currentstudentcount;

    private Integer typeid;

    private Integer titlesourceid;

    private String topicselectionmode;

    private String workload;

    private String complexity;

    private Integer requirestudentcount;

    private String optionalprofessional;

    private String subjectaffiliation;

    private String declaretime;

    private String instructorname;

    private String declarestudentno;

    private Integer bsxtauditstatusid;

    private String bsxtinstructoropinion;

    private String bsxtinstructordeclaretime;

    private String bsxtinstructorshr;

    private String bsxtexpertopinion;

    private String bsxtexpertdetailopinion;

    private String bsxtexpertdeclaretime;

    private String bsxtexpertshr;

    private String choosestudentid;

    private Boolean teacherDeclareSign;

    private Designtype designtype;
    
    private Titlesource titlesource;
    
    private Teacher Instructor;

    private Student student;

    private Department department;     
    
    private Auditstatustype Bsxtauditstatus;

	@Override
	public String toString() {
		return "Graduationdesign [graduationdesignid=" + graduationdesignid + ", title=" + title + ", departmentid="
				+ departmentid + ", instructorid=" + instructorid + ", currentstudentcount=" + currentstudentcount
				+ ", typeid=" + typeid + ", titlesourceid=" + titlesourceid + ", topicselectionmode="
				+ topicselectionmode + ", workload=" + workload + ", complexity=" + complexity
				+ ", requirestudentcount=" + requirestudentcount + ", optionalprofessional=" + optionalprofessional
				+ ", subjectaffiliation=" + subjectaffiliation + ", declaretime=" + declaretime + ", instructorname="
				+ instructorname + ", declarestudentno=" + declarestudentno + ", bsxtauditstatusid=" + bsxtauditstatusid
				+ ", bsxtinstructoropinion=" + bsxtinstructoropinion + ", bsxtinstructordeclaretime="
				+ bsxtinstructordeclaretime + ", bsxtinstructorshr=" + bsxtinstructorshr + ", bsxtexpertopinion="
				+ bsxtexpertopinion + ", bsxtexpertdetailopinion=" + bsxtexpertdetailopinion
				+ ", bsxtexpertdeclaretime=" + bsxtexpertdeclaretime + ", bsxtexpertshr=" + bsxtexpertshr
				+ ", choosestudentid=" + choosestudentid + ", teacherDeclareSign=" + teacherDeclareSign
				+ ", designtype=" + designtype + ", titlesource=" + titlesource + ", Instructor=" + Instructor
				+ ", student=" + student + ", department=" + department + ", Bsxtauditstatus=" + Bsxtauditstatus + "]";
	}

	public Auditstatustype getBsxtauditstatus() {
		return Bsxtauditstatus;
	}

	public void setBsxtauditstatus(Auditstatustype bsxtauditstatus) {
		Bsxtauditstatus = bsxtauditstatus;
	}

	public Designtype getDesigntype() {
		return designtype;
	}

	public void setDesigntype(Designtype designtype) {
		this.designtype = designtype;
	}

	public Titlesource getTitlesource() {
		return titlesource;
	}

	public void setTitlesource(Titlesource titlesource) {
		this.titlesource = titlesource;
	}

	public Teacher getInstructor() {
		return Instructor;
	}

	public void setInstructor(Teacher instructor) {
		Instructor = instructor;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Integer getGraduationdesignid() {
        return graduationdesignid;
    }

    public void setGraduationdesignid(Integer graduationdesignid) {
        this.graduationdesignid = graduationdesignid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getInstructorid() {
        return instructorid;
    }

    public void setInstructorid(String instructorid) {
        this.instructorid = instructorid == null ? null : instructorid.trim();
    }

    public Integer getCurrentstudentcount() {
        return currentstudentcount;
    }

    public void setCurrentstudentcount(Integer currentstudentcount) {
        this.currentstudentcount = currentstudentcount;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getTitlesourceid() {
        return titlesourceid;
    }

    public void setTitlesourceid(Integer titlesourceid) {
        this.titlesourceid = titlesourceid;
    }

    public String getTopicselectionmode() {
        return topicselectionmode;
    }

    public void setTopicselectionmode(String topicselectionmode) {
        this.topicselectionmode = topicselectionmode == null ? null : topicselectionmode.trim();
    }

    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload == null ? null : workload.trim();
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity == null ? null : complexity.trim();
    }

    public Integer getRequirestudentcount() {
        return requirestudentcount;
    }

    public void setRequirestudentcount(Integer requirestudentcount) {
        this.requirestudentcount = requirestudentcount;
    }

    public String getOptionalprofessional() {
        return optionalprofessional;
    }

    public void setOptionalprofessional(String optionalprofessional) {
        this.optionalprofessional = optionalprofessional == null ? null : optionalprofessional.trim();
    }

    public String getSubjectaffiliation() {
        return subjectaffiliation;
    }

    public void setSubjectaffiliation(String subjectaffiliation) {
        this.subjectaffiliation = subjectaffiliation == null ? null : subjectaffiliation.trim();
    }

    public String getDeclaretime() {
        return declaretime;
    }

    public void setDeclaretime(String declaretime) {
        this.declaretime = declaretime == null ? null : declaretime.trim();
    }

    public String getInstructorname() {
        return instructorname;
    }

    public void setInstructorname(String instructorname) {
        this.instructorname = instructorname == null ? null : instructorname.trim();
    }

    public String getDeclarestudentno() {
        return declarestudentno;
    }

    public void setDeclarestudentno(String declarestudentno) {
        this.declarestudentno = declarestudentno == null ? null : declarestudentno.trim();
    }

    public Integer getBsxtauditstatusid() {
        return bsxtauditstatusid;
    }

    public void setBsxtauditstatusid(Integer bsxtauditstatusid) {
        this.bsxtauditstatusid = bsxtauditstatusid;
    }

    public String getBsxtinstructoropinion() {
        return bsxtinstructoropinion;
    }

    public void setBsxtinstructoropinion(String bsxtinstructoropinion) {
        this.bsxtinstructoropinion = bsxtinstructoropinion == null ? null : bsxtinstructoropinion.trim();
    }

    public String getBsxtinstructordeclaretime() {
        return bsxtinstructordeclaretime;
    }

    public void setBsxtinstructordeclaretime(String bsxtinstructordeclaretime) {
        this.bsxtinstructordeclaretime = bsxtinstructordeclaretime == null ? null : bsxtinstructordeclaretime.trim();
    }

    public String getBsxtinstructorshr() {
        return bsxtinstructorshr;
    }

    public void setBsxtinstructorshr(String bsxtinstructorshr) {
        this.bsxtinstructorshr = bsxtinstructorshr == null ? null : bsxtinstructorshr.trim();
    }

    public String getBsxtexpertopinion() {
        return bsxtexpertopinion;
    }

    public void setBsxtexpertopinion(String bsxtexpertopinion) {
        this.bsxtexpertopinion = bsxtexpertopinion == null ? null : bsxtexpertopinion.trim();
    }

    public String getBsxtexpertdetailopinion() {
        return bsxtexpertdetailopinion;
    }

    public void setBsxtexpertdetailopinion(String bsxtexpertdetailopinion) {
        this.bsxtexpertdetailopinion = bsxtexpertdetailopinion == null ? null : bsxtexpertdetailopinion.trim();
    }

    public String getBsxtexpertdeclaretime() {
        return bsxtexpertdeclaretime;
    }

    public void setBsxtexpertdeclaretime(String bsxtexpertdeclaretime) {
        this.bsxtexpertdeclaretime = bsxtexpertdeclaretime == null ? null : bsxtexpertdeclaretime.trim();
    }

    public String getBsxtexpertshr() {
        return bsxtexpertshr;
    }

    public void setBsxtexpertshr(String bsxtexpertshr) {
        this.bsxtexpertshr = bsxtexpertshr == null ? null : bsxtexpertshr.trim();
    }

    public String getChoosestudentid() {
        return choosestudentid;
    }

    public void setChoosestudentid(String choosestudentid) {
        this.choosestudentid = choosestudentid == null ? null : choosestudentid.trim();
    }

    public Boolean getTeacherDeclareSign() {
        return teacherDeclareSign;
    }

    public void setTeacherDeclareSign(Boolean teacherDeclareSign) {
        this.teacherDeclareSign = teacherDeclareSign;
    }
}