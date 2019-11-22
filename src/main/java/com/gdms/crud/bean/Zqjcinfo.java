package com.gdms.crud.bean;

public class Zqjcinfo {
    private Integer zqjcinfoid;

    private String studentid;

    private Integer graduationdesignid;

    private String xtbh;

    private String sfyryt;

    private String sfktbg;

    private String sfwxzs;

    private String jdqk;

    private String gzztqk;

    private String cywxzlnl;

    private String zqzlpj;

    private String bylwnrtz;

    private String zdcs;

    private String aqwc;

    private String yscl;

    private String fjname;

    private String fjpath;

    private String uploadtime;

    private String lastalerttime;

    private Graduationdesign graduationdesign;
    
    private Student student;
    
    @Override
	public String toString() {
		return "Zqjcinfo [zqjcinfoid=" + zqjcinfoid + ", studentid=" + studentid + ", graduationdesignid="
				+ graduationdesignid + ", xtbh=" + xtbh + ", sfyryt=" + sfyryt + ", sfktbg=" + sfktbg + ", sfwxzs="
				+ sfwxzs + ", jdqk=" + jdqk + ", gzztqk=" + gzztqk + ", cywxzlnl=" + cywxzlnl + ", zqzlpj=" + zqzlpj
				+ ", bylwnrtz=" + bylwnrtz + ", zdcs=" + zdcs + ", aqwc=" + aqwc + ", yscl=" + yscl + ", fjname="
				+ fjname + ", fjpath=" + fjpath + ", uploadtime=" + uploadtime + ", lastalerttime=" + lastalerttime
				+ ", graduationdesign=" + graduationdesign + ", student=" + student + "]";
	}

	public Graduationdesign getGraduationdesign() {
		return graduationdesign;
	}

	public void setGraduationdesign(Graduationdesign graduationdesign) {
		this.graduationdesign = graduationdesign;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getZqjcinfoid() {
        return zqjcinfoid;
    }

    public void setZqjcinfoid(Integer zqjcinfoid) {
        this.zqjcinfoid = zqjcinfoid;
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

    public String getXtbh() {
        return xtbh;
    }

    public void setXtbh(String xtbh) {
        this.xtbh = xtbh == null ? null : xtbh.trim();
    }

    public String getSfyryt() {
        return sfyryt;
    }

    public void setSfyryt(String sfyryt) {
        this.sfyryt = sfyryt == null ? null : sfyryt.trim();
    }

    public String getSfktbg() {
        return sfktbg;
    }

    public void setSfktbg(String sfktbg) {
        this.sfktbg = sfktbg == null ? null : sfktbg.trim();
    }

    public String getSfwxzs() {
        return sfwxzs;
    }

    public void setSfwxzs(String sfwxzs) {
        this.sfwxzs = sfwxzs == null ? null : sfwxzs.trim();
    }

    public String getJdqk() {
        return jdqk;
    }

    public void setJdqk(String jdqk) {
        this.jdqk = jdqk == null ? null : jdqk.trim();
    }

    public String getGzztqk() {
        return gzztqk;
    }

    public void setGzztqk(String gzztqk) {
        this.gzztqk = gzztqk == null ? null : gzztqk.trim();
    }

    public String getCywxzlnl() {
        return cywxzlnl;
    }

    public void setCywxzlnl(String cywxzlnl) {
        this.cywxzlnl = cywxzlnl == null ? null : cywxzlnl.trim();
    }

    public String getZqzlpj() {
        return zqzlpj;
    }

    public void setZqzlpj(String zqzlpj) {
        this.zqzlpj = zqzlpj == null ? null : zqzlpj.trim();
    }

    public String getBylwnrtz() {
        return bylwnrtz;
    }

    public void setBylwnrtz(String bylwnrtz) {
        this.bylwnrtz = bylwnrtz == null ? null : bylwnrtz.trim();
    }

    public String getZdcs() {
        return zdcs;
    }

    public void setZdcs(String zdcs) {
        this.zdcs = zdcs == null ? null : zdcs.trim();
    }

    public String getAqwc() {
        return aqwc;
    }

    public void setAqwc(String aqwc) {
        this.aqwc = aqwc == null ? null : aqwc.trim();
    }

    public String getYscl() {
        return yscl;
    }

    public void setYscl(String yscl) {
        this.yscl = yscl == null ? null : yscl.trim();
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
}