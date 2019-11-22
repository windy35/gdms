package com.gdms.crud.bean;

public class Graduationdesignresult {
    private Integer graduationdesignresultid;

    private Integer graduationdesignid;

    private Integer departmentid;

    private String instructorid;

    private String studentid;

    private String choosetime;

    private String lastalerttime;

    private String title;

    private Integer typeid;

    private Integer titlesourceid;

    private Integer ktbgauditstatusid;

    private String ktbginstructoropinion;

    private String ktbginstructordeclaretime;

    private String ktbginstructorshr;

    private String ktbgexpertopinion;

    private String ktbgexpertdeclaretime;

    private String ktbgexpertshr;

    private Integer zqjcbauditstatusid;

    private String zqjcbinstructoropinion;

    private String zqjcbinstructordeclaretime;

    private String zqjcbinstructorshr;

    private String zqjcbexpertopinion;

    private String zqjcbexpertdeclaretime;

    private String zqjcbexpertshr;

    private Integer bylwauditstatusid;

    private String bylwinstructoropinion;

    private String bylwinstructordeclaretime;

    private String bylwinstructorshr;

    private String bylwexpertopinion;

    private String bylwexpertdeclaretime;

    private String bylwexpertshr;

    private Integer dbpptauditstatusid;

    private String dbpptinstructoropinion;

    private String dbpptinstructordeclaretime;

    private String dbpptinstructorshr;

    private String dbpptexpertopinion;

    private String dbpptexpertdeclaretime;

    private String dbpptexpertshr;

    private Integer ktbginfoid;

    private Integer zqjcbinfoid;

    private Integer bylwinfoid;

    private Integer dbpptinfoid;

    private Integer zdjlinfoid;

    private Integer wwywhyjinfoid;

    private Integer zdjlauditstatusid;

    private String zdjlinstructoropinion;

    private String zdjlinstructordeclaretime;

    private String zdjlinstructorshr;

    private String zdjlexpertopinion;

    private String zdjlexpertdeclaretime;

    private String zdjlexpertshr;

    private Integer wwywhyjauditstatusid;

    private String wwywhyjinstructoropinion;

    private String wwywhyjinstructordeclaretime;

    private String wwywhyjinstructorshr;

    private String wwywhyjexpertopinion;

    private String wwywhyjexpertdeclaretime;

    private String wwywhyjexpertshr;

    private Boolean teacherDeclareSign;

    private Auditstatustype bsxtauditstatus;

    private Auditstatustype ktbgauditstatus;
    
    private Auditstatustype zqjcbauditstatus;
    
    private Auditstatustype bylwauditstatus;
    
    private Auditstatustype dbpptauditstatus;

    private Auditstatustype zdjlauditstatus;

    private Auditstatustype wwywhyjauditstatus;

    private Auditstatustype wxzsauditstatus;
    
    private GraduationdesignWithBLOBs graduationdesign;
    
    private Titlesource titlesource;
    
    private Designtype designtype;           
    
    private Ktbginfo ktbginfo;     
    
    private ZqjcinfoWithBLOBs zqjcbinfo;
    
    private Zdjlinfo zdjlinfo;
    
    private WwywhyjinfoWithBLOBs wwywhyjinfo;
    
    private BylwinfoWithBLOBs bylwinfo;
    
    private Dbpptinfo dbpptinfo;
    
    private Student student;
    
    @Override
	public String toString() {
		return "Graduationdesignresult [graduationdesignresultid=" + graduationdesignresultid + ", graduationdesignid="
				+ graduationdesignid + ", departmentid=" + departmentid + ", instructorid=" + instructorid
				+ ", studentid=" + studentid + ", choosetime=" + choosetime + ", lastalerttime=" + lastalerttime
				+ ", title=" + title + ", typeid=" + typeid + ", titlesourceid=" + titlesourceid
				+ ", ktbgauditstatusid=" + ktbgauditstatusid + ", ktbginstructoropinion=" + ktbginstructoropinion
				+ ", ktbginstructordeclaretime=" + ktbginstructordeclaretime + ", ktbginstructorshr="
				+ ktbginstructorshr + ", ktbgexpertopinion=" + ktbgexpertopinion + ", ktbgexpertdeclaretime="
				+ ktbgexpertdeclaretime + ", ktbgexpertshr=" + ktbgexpertshr + ", zqjcbauditstatusid="
				+ zqjcbauditstatusid + ", zqjcbinstructoropinion=" + zqjcbinstructoropinion
				+ ", zqjcbinstructordeclaretime=" + zqjcbinstructordeclaretime + ", zqjcbinstructorshr="
				+ zqjcbinstructorshr + ", zqjcbexpertopinion=" + zqjcbexpertopinion + ", zqjcbexpertdeclaretime="
				+ zqjcbexpertdeclaretime + ", zqjcbexpertshr=" + zqjcbexpertshr + ", bylwauditstatusid="
				+ bylwauditstatusid + ", bylwinstructoropinion=" + bylwinstructoropinion
				+ ", bylwinstructordeclaretime=" + bylwinstructordeclaretime + ", bylwinstructorshr="
				+ bylwinstructorshr + ", bylwexpertopinion=" + bylwexpertopinion + ", bylwexpertdeclaretime="
				+ bylwexpertdeclaretime + ", bylwexpertshr=" + bylwexpertshr + ", dbpptauditstatusid="
				+ dbpptauditstatusid + ", dbpptinstructoropinion=" + dbpptinstructoropinion
				+ ", dbpptinstructordeclaretime=" + dbpptinstructordeclaretime + ", dbpptinstructorshr="
				+ dbpptinstructorshr + ", dbpptexpertopinion=" + dbpptexpertopinion + ", dbpptexpertdeclaretime="
				+ dbpptexpertdeclaretime + ", dbpptexpertshr=" + dbpptexpertshr + ", ktbginfoid=" + ktbginfoid
				+ ", zqjcbinfoid=" + zqjcbinfoid + ", bylwinfoid=" + bylwinfoid + ", dbpptinfoid=" + dbpptinfoid
				+ ", zdjlinfoid=" + zdjlinfoid + ", wwywhyjinfoid=" + wwywhyjinfoid + ", zdjlauditstatusid="
				+ zdjlauditstatusid + ", zdjlinstructoropinion=" + zdjlinstructoropinion
				+ ", zdjlinstructordeclaretime=" + zdjlinstructordeclaretime + ", zdjlinstructorshr="
				+ zdjlinstructorshr + ", zdjlexpertopinion=" + zdjlexpertopinion + ", zdjlexpertdeclaretime="
				+ zdjlexpertdeclaretime + ", zdjlexpertshr=" + zdjlexpertshr + ", wwywhyjauditstatusid="
				+ wwywhyjauditstatusid + ", wwywhyjinstructoropinion=" + wwywhyjinstructoropinion
				+ ", wwywhyjinstructordeclaretime=" + wwywhyjinstructordeclaretime + ", wwywhyjinstructorshr="
				+ wwywhyjinstructorshr + ", wwywhyjexpertopinion=" + wwywhyjexpertopinion
				+ ", wwywhyjexpertdeclaretime=" + wwywhyjexpertdeclaretime + ", wwywhyjexpertshr=" + wwywhyjexpertshr
				+ ", teacherDeclareSign=" + teacherDeclareSign + ", bsxtauditstatus=" + bsxtauditstatus
				+ ", ktbgauditstatus=" + ktbgauditstatus + ", zqjcbauditstatus=" + zqjcbauditstatus
				+ ", bylwauditstatus=" + bylwauditstatus + ", dbpptauditstatus=" + dbpptauditstatus
				+ ", zdjlauditstatus=" + zdjlauditstatus + ", wwywhyjauditstatus=" + wwywhyjauditstatus
				+ ", wxzsauditstatus=" + wxzsauditstatus + ", graduationdesign=" + graduationdesign + ", titlesource="
				+ titlesource + ", designtype=" + designtype + ", ktbginfo=" + ktbginfo + ", zqjcbinfo=" + zqjcbinfo
				+ ", zdjlinfo=" + zdjlinfo + ", wwywhyjinfo=" + wwywhyjinfo + ", bylwinfo=" + bylwinfo + ", dbpptinfo="
				+ dbpptinfo + ", student=" + student + "]";
	}

	public Auditstatustype getBsxtauditstatus() {
		return bsxtauditstatus;
	}

	public void setBsxtauditstatus(Auditstatustype bsxtauditstatus) {
		this.bsxtauditstatus = bsxtauditstatus;
	}

	public Auditstatustype getKtbgauditstatus() {
		return ktbgauditstatus;
	}

	public void setKtbgauditstatus(Auditstatustype ktbgauditstatus) {
		this.ktbgauditstatus = ktbgauditstatus;
	}

	public Auditstatustype getZqjcbauditstatus() {
		return zqjcbauditstatus;
	}

	public void setZqjcbauditstatus(Auditstatustype zqjcbauditstatus) {
		this.zqjcbauditstatus = zqjcbauditstatus;
	}

	public Auditstatustype getBylwauditstatus() {
		return bylwauditstatus;
	}

	public void setBylwauditstatus(Auditstatustype bylwauditstatus) {
		this.bylwauditstatus = bylwauditstatus;
	}

	public Auditstatustype getDbpptauditstatus() {
		return dbpptauditstatus;
	}

	public void setDbpptauditstatus(Auditstatustype dbpptauditstatus) {
		this.dbpptauditstatus = dbpptauditstatus;
	}

	public Auditstatustype getZdjlauditstatus() {
		return zdjlauditstatus;
	}

	public void setZdjlauditstatus(Auditstatustype zdjlauditstatus) {
		this.zdjlauditstatus = zdjlauditstatus;
	}

	public Auditstatustype getWwywhyjauditstatus() {
		return wwywhyjauditstatus;
	}

	public void setWwywhyjauditstatus(Auditstatustype wwywhyjauditstatus) {
		this.wwywhyjauditstatus = wwywhyjauditstatus;
	}

	public Auditstatustype getWxzsauditstatus() {
		return wxzsauditstatus;
	}

	public void setWxzsauditstatus(Auditstatustype wxzsauditstatus) {
		this.wxzsauditstatus = wxzsauditstatus;
	}

	public GraduationdesignWithBLOBs getGraduationdesign() {
		return graduationdesign;
	}

	public void setGraduationdesign(GraduationdesignWithBLOBs graduationdesign) {
		this.graduationdesign = graduationdesign;
	}

	public Titlesource getTitlesource() {
		return titlesource;
	}

	public void setTitlesource(Titlesource titlesource) {
		this.titlesource = titlesource;
	}

	public Designtype getDesigntype() {
		return designtype;
	}

	public void setDesigntype(Designtype designtype) {
		this.designtype = designtype;
	}

	public Ktbginfo getKtbginfo() {
		return ktbginfo;
	}

	public void setKtbginfo(Ktbginfo ktbginfo) {
		this.ktbginfo = ktbginfo;
	}

	public ZqjcinfoWithBLOBs getZqjcbinfo() {
		return zqjcbinfo;
	}

	public void setZqjcbinfo(ZqjcinfoWithBLOBs zqjcbinfo) {
		this.zqjcbinfo = zqjcbinfo;
	}

	public Zdjlinfo getZdjlinfo() {
		return zdjlinfo;
	}

	public void setZdjlinfo(Zdjlinfo zdjlinfo) {
		this.zdjlinfo = zdjlinfo;
	}

	public WwywhyjinfoWithBLOBs getWwywhyjinfo() {
		return wwywhyjinfo;
	}

	public void setWwywhyjinfo(WwywhyjinfoWithBLOBs wwywhyjinfo) {
		this.wwywhyjinfo = wwywhyjinfo;
	}

	public BylwinfoWithBLOBs getBylwinfo() {
		return bylwinfo;
	}

	public void setBylwinfo(BylwinfoWithBLOBs bylwinfo) {
		this.bylwinfo = bylwinfo;
	}

	public Dbpptinfo getDbpptinfo() {
		return dbpptinfo;
	}

	public void setDbpptinfo(Dbpptinfo dbpptinfo) {
		this.dbpptinfo = dbpptinfo;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getGraduationdesignresultid() {
        return graduationdesignresultid;
    }

    public void setGraduationdesignresultid(Integer graduationdesignresultid) {
        this.graduationdesignresultid = graduationdesignresultid;
    }

    public Integer getGraduationdesignid() {
        return graduationdesignid;
    }

    public void setGraduationdesignid(Integer graduationdesignid) {
        this.graduationdesignid = graduationdesignid;
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

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getChoosetime() {
        return choosetime;
    }

    public void setChoosetime(String choosetime) {
        this.choosetime = choosetime == null ? null : choosetime.trim();
    }

    public String getLastalerttime() {
        return lastalerttime;
    }

    public void setLastalerttime(String lastalerttime) {
        this.lastalerttime = lastalerttime == null ? null : lastalerttime.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public Integer getKtbgauditstatusid() {
        return ktbgauditstatusid;
    }

    public void setKtbgauditstatusid(Integer ktbgauditstatusid) {
        this.ktbgauditstatusid = ktbgauditstatusid;
    }

    public String getKtbginstructoropinion() {
        return ktbginstructoropinion;
    }

    public void setKtbginstructoropinion(String ktbginstructoropinion) {
        this.ktbginstructoropinion = ktbginstructoropinion == null ? null : ktbginstructoropinion.trim();
    }

    public String getKtbginstructordeclaretime() {
        return ktbginstructordeclaretime;
    }

    public void setKtbginstructordeclaretime(String ktbginstructordeclaretime) {
        this.ktbginstructordeclaretime = ktbginstructordeclaretime == null ? null : ktbginstructordeclaretime.trim();
    }

    public String getKtbginstructorshr() {
        return ktbginstructorshr;
    }

    public void setKtbginstructorshr(String ktbginstructorshr) {
        this.ktbginstructorshr = ktbginstructorshr == null ? null : ktbginstructorshr.trim();
    }

    public String getKtbgexpertopinion() {
        return ktbgexpertopinion;
    }

    public void setKtbgexpertopinion(String ktbgexpertopinion) {
        this.ktbgexpertopinion = ktbgexpertopinion == null ? null : ktbgexpertopinion.trim();
    }

    public String getKtbgexpertdeclaretime() {
        return ktbgexpertdeclaretime;
    }

    public void setKtbgexpertdeclaretime(String ktbgexpertdeclaretime) {
        this.ktbgexpertdeclaretime = ktbgexpertdeclaretime == null ? null : ktbgexpertdeclaretime.trim();
    }

    public String getKtbgexpertshr() {
        return ktbgexpertshr;
    }

    public void setKtbgexpertshr(String ktbgexpertshr) {
        this.ktbgexpertshr = ktbgexpertshr == null ? null : ktbgexpertshr.trim();
    }

    public Integer getZqjcbauditstatusid() {
        return zqjcbauditstatusid;
    }

    public void setZqjcbauditstatusid(Integer zqjcbauditstatusid) {
        this.zqjcbauditstatusid = zqjcbauditstatusid;
    }

    public String getZqjcbinstructoropinion() {
        return zqjcbinstructoropinion;
    }

    public void setZqjcbinstructoropinion(String zqjcbinstructoropinion) {
        this.zqjcbinstructoropinion = zqjcbinstructoropinion == null ? null : zqjcbinstructoropinion.trim();
    }

    public String getZqjcbinstructordeclaretime() {
        return zqjcbinstructordeclaretime;
    }

    public void setZqjcbinstructordeclaretime(String zqjcbinstructordeclaretime) {
        this.zqjcbinstructordeclaretime = zqjcbinstructordeclaretime == null ? null : zqjcbinstructordeclaretime.trim();
    }

    public String getZqjcbinstructorshr() {
        return zqjcbinstructorshr;
    }

    public void setZqjcbinstructorshr(String zqjcbinstructorshr) {
        this.zqjcbinstructorshr = zqjcbinstructorshr == null ? null : zqjcbinstructorshr.trim();
    }

    public String getZqjcbexpertopinion() {
        return zqjcbexpertopinion;
    }

    public void setZqjcbexpertopinion(String zqjcbexpertopinion) {
        this.zqjcbexpertopinion = zqjcbexpertopinion == null ? null : zqjcbexpertopinion.trim();
    }

    public String getZqjcbexpertdeclaretime() {
        return zqjcbexpertdeclaretime;
    }

    public void setZqjcbexpertdeclaretime(String zqjcbexpertdeclaretime) {
        this.zqjcbexpertdeclaretime = zqjcbexpertdeclaretime == null ? null : zqjcbexpertdeclaretime.trim();
    }

    public String getZqjcbexpertshr() {
        return zqjcbexpertshr;
    }

    public void setZqjcbexpertshr(String zqjcbexpertshr) {
        this.zqjcbexpertshr = zqjcbexpertshr == null ? null : zqjcbexpertshr.trim();
    }

    public Integer getBylwauditstatusid() {
        return bylwauditstatusid;
    }

    public void setBylwauditstatusid(Integer bylwauditstatusid) {
        this.bylwauditstatusid = bylwauditstatusid;
    }

    public String getBylwinstructoropinion() {
        return bylwinstructoropinion;
    }

    public void setBylwinstructoropinion(String bylwinstructoropinion) {
        this.bylwinstructoropinion = bylwinstructoropinion == null ? null : bylwinstructoropinion.trim();
    }

    public String getBylwinstructordeclaretime() {
        return bylwinstructordeclaretime;
    }

    public void setBylwinstructordeclaretime(String bylwinstructordeclaretime) {
        this.bylwinstructordeclaretime = bylwinstructordeclaretime == null ? null : bylwinstructordeclaretime.trim();
    }

    public String getBylwinstructorshr() {
        return bylwinstructorshr;
    }

    public void setBylwinstructorshr(String bylwinstructorshr) {
        this.bylwinstructorshr = bylwinstructorshr == null ? null : bylwinstructorshr.trim();
    }

    public String getBylwexpertopinion() {
        return bylwexpertopinion;
    }

    public void setBylwexpertopinion(String bylwexpertopinion) {
        this.bylwexpertopinion = bylwexpertopinion == null ? null : bylwexpertopinion.trim();
    }

    public String getBylwexpertdeclaretime() {
        return bylwexpertdeclaretime;
    }

    public void setBylwexpertdeclaretime(String bylwexpertdeclaretime) {
        this.bylwexpertdeclaretime = bylwexpertdeclaretime == null ? null : bylwexpertdeclaretime.trim();
    }

    public String getBylwexpertshr() {
        return bylwexpertshr;
    }

    public void setBylwexpertshr(String bylwexpertshr) {
        this.bylwexpertshr = bylwexpertshr == null ? null : bylwexpertshr.trim();
    }

    public Integer getDbpptauditstatusid() {
        return dbpptauditstatusid;
    }

    public void setDbpptauditstatusid(Integer dbpptauditstatusid) {
        this.dbpptauditstatusid = dbpptauditstatusid;
    }

    public String getDbpptinstructoropinion() {
        return dbpptinstructoropinion;
    }

    public void setDbpptinstructoropinion(String dbpptinstructoropinion) {
        this.dbpptinstructoropinion = dbpptinstructoropinion == null ? null : dbpptinstructoropinion.trim();
    }

    public String getDbpptinstructordeclaretime() {
        return dbpptinstructordeclaretime;
    }

    public void setDbpptinstructordeclaretime(String dbpptinstructordeclaretime) {
        this.dbpptinstructordeclaretime = dbpptinstructordeclaretime == null ? null : dbpptinstructordeclaretime.trim();
    }

    public String getDbpptinstructorshr() {
        return dbpptinstructorshr;
    }

    public void setDbpptinstructorshr(String dbpptinstructorshr) {
        this.dbpptinstructorshr = dbpptinstructorshr == null ? null : dbpptinstructorshr.trim();
    }

    public String getDbpptexpertopinion() {
        return dbpptexpertopinion;
    }

    public void setDbpptexpertopinion(String dbpptexpertopinion) {
        this.dbpptexpertopinion = dbpptexpertopinion == null ? null : dbpptexpertopinion.trim();
    }

    public String getDbpptexpertdeclaretime() {
        return dbpptexpertdeclaretime;
    }

    public void setDbpptexpertdeclaretime(String dbpptexpertdeclaretime) {
        this.dbpptexpertdeclaretime = dbpptexpertdeclaretime == null ? null : dbpptexpertdeclaretime.trim();
    }

    public String getDbpptexpertshr() {
        return dbpptexpertshr;
    }

    public void setDbpptexpertshr(String dbpptexpertshr) {
        this.dbpptexpertshr = dbpptexpertshr == null ? null : dbpptexpertshr.trim();
    }

    public Integer getKtbginfoid() {
        return ktbginfoid;
    }

    public void setKtbginfoid(Integer ktbginfoid) {
        this.ktbginfoid = ktbginfoid;
    }

    public Integer getZqjcbinfoid() {
        return zqjcbinfoid;
    }

    public void setZqjcbinfoid(Integer zqjcbinfoid) {
        this.zqjcbinfoid = zqjcbinfoid;
    }

    public Integer getBylwinfoid() {
        return bylwinfoid;
    }

    public void setBylwinfoid(Integer bylwinfoid) {
        this.bylwinfoid = bylwinfoid;
    }

    public Integer getDbpptinfoid() {
        return dbpptinfoid;
    }

    public void setDbpptinfoid(Integer dbpptinfoid) {
        this.dbpptinfoid = dbpptinfoid;
    }

    public Integer getZdjlinfoid() {
        return zdjlinfoid;
    }

    public void setZdjlinfoid(Integer zdjlinfoid) {
        this.zdjlinfoid = zdjlinfoid;
    }

    public Integer getWwywhyjinfoid() {
        return wwywhyjinfoid;
    }

    public void setWwywhyjinfoid(Integer wwywhyjinfoid) {
        this.wwywhyjinfoid = wwywhyjinfoid;
    }

    public Integer getZdjlauditstatusid() {
        return zdjlauditstatusid;
    }

    public void setZdjlauditstatusid(Integer zdjlauditstatusid) {
        this.zdjlauditstatusid = zdjlauditstatusid;
    }

    public String getZdjlinstructoropinion() {
        return zdjlinstructoropinion;
    }

    public void setZdjlinstructoropinion(String zdjlinstructoropinion) {
        this.zdjlinstructoropinion = zdjlinstructoropinion == null ? null : zdjlinstructoropinion.trim();
    }

    public String getZdjlinstructordeclaretime() {
        return zdjlinstructordeclaretime;
    }

    public void setZdjlinstructordeclaretime(String zdjlinstructordeclaretime) {
        this.zdjlinstructordeclaretime = zdjlinstructordeclaretime == null ? null : zdjlinstructordeclaretime.trim();
    }

    public String getZdjlinstructorshr() {
        return zdjlinstructorshr;
    }

    public void setZdjlinstructorshr(String zdjlinstructorshr) {
        this.zdjlinstructorshr = zdjlinstructorshr == null ? null : zdjlinstructorshr.trim();
    }

    public String getZdjlexpertopinion() {
        return zdjlexpertopinion;
    }

    public void setZdjlexpertopinion(String zdjlexpertopinion) {
        this.zdjlexpertopinion = zdjlexpertopinion == null ? null : zdjlexpertopinion.trim();
    }

    public String getZdjlexpertdeclaretime() {
        return zdjlexpertdeclaretime;
    }

    public void setZdjlexpertdeclaretime(String zdjlexpertdeclaretime) {
        this.zdjlexpertdeclaretime = zdjlexpertdeclaretime == null ? null : zdjlexpertdeclaretime.trim();
    }

    public String getZdjlexpertshr() {
        return zdjlexpertshr;
    }

    public void setZdjlexpertshr(String zdjlexpertshr) {
        this.zdjlexpertshr = zdjlexpertshr == null ? null : zdjlexpertshr.trim();
    }

    public Integer getWwywhyjauditstatusid() {
        return wwywhyjauditstatusid;
    }

    public void setWwywhyjauditstatusid(Integer wwywhyjauditstatusid) {
        this.wwywhyjauditstatusid = wwywhyjauditstatusid;
    }

    public String getWwywhyjinstructoropinion() {
        return wwywhyjinstructoropinion;
    }

    public void setWwywhyjinstructoropinion(String wwywhyjinstructoropinion) {
        this.wwywhyjinstructoropinion = wwywhyjinstructoropinion == null ? null : wwywhyjinstructoropinion.trim();
    }

    public String getWwywhyjinstructordeclaretime() {
        return wwywhyjinstructordeclaretime;
    }

    public void setWwywhyjinstructordeclaretime(String wwywhyjinstructordeclaretime) {
        this.wwywhyjinstructordeclaretime = wwywhyjinstructordeclaretime == null ? null : wwywhyjinstructordeclaretime.trim();
    }

    public String getWwywhyjinstructorshr() {
        return wwywhyjinstructorshr;
    }

    public void setWwywhyjinstructorshr(String wwywhyjinstructorshr) {
        this.wwywhyjinstructorshr = wwywhyjinstructorshr == null ? null : wwywhyjinstructorshr.trim();
    }

    public String getWwywhyjexpertopinion() {
        return wwywhyjexpertopinion;
    }

    public void setWwywhyjexpertopinion(String wwywhyjexpertopinion) {
        this.wwywhyjexpertopinion = wwywhyjexpertopinion == null ? null : wwywhyjexpertopinion.trim();
    }

    public String getWwywhyjexpertdeclaretime() {
        return wwywhyjexpertdeclaretime;
    }

    public void setWwywhyjexpertdeclaretime(String wwywhyjexpertdeclaretime) {
        this.wwywhyjexpertdeclaretime = wwywhyjexpertdeclaretime == null ? null : wwywhyjexpertdeclaretime.trim();
    }

    public String getWwywhyjexpertshr() {
        return wwywhyjexpertshr;
    }

    public void setWwywhyjexpertshr(String wwywhyjexpertshr) {
        this.wwywhyjexpertshr = wwywhyjexpertshr == null ? null : wwywhyjexpertshr.trim();
    }

    public Boolean getTeacherDeclareSign() {
        return teacherDeclareSign;
    }

    public void setTeacherDeclareSign(Boolean teacherDeclareSign) {
        this.teacherDeclareSign = teacherDeclareSign;
    }
}