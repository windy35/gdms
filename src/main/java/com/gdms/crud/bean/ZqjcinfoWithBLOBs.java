package com.gdms.crud.bean;

public class ZqjcinfoWithBLOBs extends Zqjcinfo {
    private String qzrq;

    private String xtbhyy;

    private String jdzhyy;

    private String qt;

    @Override
	public String toString() {
		return super.toString() + "ZqjcinfoWithBLOBs [qzrq=" + qzrq + ", xtbhyy=" + xtbhyy + ", jdzhyy=" + jdzhyy + ", qt=" + qt + "]";
	}

	public String getQzrq() {
        return qzrq;
    }

    public void setQzrq(String qzrq) {
        this.qzrq = qzrq == null ? null : qzrq.trim();
    }

    public String getXtbhyy() {
        return xtbhyy;
    }

    public void setXtbhyy(String xtbhyy) {
        this.xtbhyy = xtbhyy == null ? null : xtbhyy.trim();
    }

    public String getJdzhyy() {
        return jdzhyy;
    }

    public void setJdzhyy(String jdzhyy) {
        this.jdzhyy = jdzhyy == null ? null : jdzhyy.trim();
    }

    public String getQt() {
        return qt;
    }

    public void setQt(String qt) {
        this.qt = qt == null ? null : qt.trim();
    }
}