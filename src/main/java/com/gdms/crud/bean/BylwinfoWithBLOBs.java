package com.gdms.crud.bean;

public class BylwinfoWithBLOBs extends Bylwinfo {
    private String gjc;

    private String cxd;

    private String zwzy;

    private String ywzy;

    private String qt;

    @Override
	public String toString() {
		return super.toString() + "BylwinfoWithBLOBs [gjc=" + gjc + ", cxd=" + cxd + ", zwzy=" + zwzy + ", ywzy=" + ywzy + ", qt=" + qt
				+ "]";
	}

	public String getGjc() {
        return gjc;
    }

    public void setGjc(String gjc) {
        this.gjc = gjc == null ? null : gjc.trim();
    }

    public String getCxd() {
        return cxd;
    }

    public void setCxd(String cxd) {
        this.cxd = cxd == null ? null : cxd.trim();
    }

    public String getZwzy() {
        return zwzy;
    }

    public void setZwzy(String zwzy) {
        this.zwzy = zwzy == null ? null : zwzy.trim();
    }

    public String getYwzy() {
        return ywzy;
    }

    public void setYwzy(String ywzy) {
        this.ywzy = ywzy == null ? null : ywzy.trim();
    }

    public String getQt() {
        return qt;
    }

    public void setQt(String qt) {
        this.qt = qt == null ? null : qt.trim();
    }
}