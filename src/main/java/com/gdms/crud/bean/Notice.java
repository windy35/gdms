package com.gdms.crud.bean;

public class Notice {
    private Integer noticeid;

    private String noticetitle;

    private String notifier;

    private String declaretime;

    private String fjname;

    private String fjpath;

    private String noticecontent;

    @Override
	public String toString() {
		return "Notice [noticeid=" + noticeid + ", noticetitle=" + noticetitle + ", notifier=" + notifier
				+ ", declaretime=" + declaretime + ", fjname=" + fjname + ", fjpath=" + fjpath + ", noticecontent="
				+ noticecontent + "]";
	}

	public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public String getNoticetitle() {
        return noticetitle;
    }

    public void setNoticetitle(String noticetitle) {
        this.noticetitle = noticetitle == null ? null : noticetitle.trim();
    }

    public String getNotifier() {
        return notifier;
    }

    public void setNotifier(String notifier) {
        this.notifier = notifier == null ? null : notifier.trim();
    }

    public String getDeclaretime() {
        return declaretime;
    }

    public void setDeclaretime(String declaretime) {
        this.declaretime = declaretime == null ? null : declaretime.trim();
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

    public String getNoticecontent() {
        return noticecontent;
    }

    public void setNoticecontent(String noticecontent) {
        this.noticecontent = noticecontent == null ? null : noticecontent.trim();
    }
}