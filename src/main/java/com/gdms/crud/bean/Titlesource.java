package com.gdms.crud.bean;

public class Titlesource {
    private Integer titlesourceid;

    private String titlesourcename;

    @Override
	public String toString() {
		return "Titlesource [titlesourceid=" + titlesourceid + ", titlesourcename=" + titlesourcename + "]";
	}

	public Integer getTitlesourceid() {
        return titlesourceid;
    }

    public void setTitlesourceid(Integer titlesourceid) {
        this.titlesourceid = titlesourceid;
    }

    public String getTitlesourcename() {
        return titlesourcename;
    }

    public void setTitlesourcename(String titlesourcename) {
        this.titlesourcename = titlesourcename == null ? null : titlesourcename.trim();
    }
}