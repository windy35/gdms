package com.gdms.crud.bean;

public class WwywhyjinfoWithBLOBs extends Wwywhyjinfo {
    private String wwywnr;

    private String ywnr;

    @Override
	public String toString() {
		return super.toString() + "WwywhyjinfoWithBLOBs [wwywnr=" + wwywnr + ", ywnr=" + ywnr + "]";
	}

	public String getWwywnr() {
        return wwywnr;
    }

    public void setWwywnr(String wwywnr) {
        this.wwywnr = wwywnr == null ? null : wwywnr.trim();
    }

    public String getYwnr() {
        return ywnr;
    }

    public void setYwnr(String ywnr) {
        this.ywnr = ywnr == null ? null : ywnr.trim();
    }
}