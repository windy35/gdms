package com.gdms.crud.bean;

public class GraduationdesignWithBLOBs extends Graduationdesign {
    private String gdintroduction;

    private String gdtask;

    private String bsxtinstructordetailopinion;

    @Override
	public String toString() {
		return super.toString() + "GraduationdesignWithBLOBs [gdintroduction=" + gdintroduction + ", gdtask=" + gdtask
				+ ", bsxtinstructordetailopinion=" + bsxtinstructordetailopinion + "]";
	}

	public String getGdintroduction() {
        return gdintroduction;
    }

    public void setGdintroduction(String gdintroduction) {
        this.gdintroduction = gdintroduction == null ? null : gdintroduction.trim();
    }

    public String getGdtask() {
        return gdtask;
    }

    public void setGdtask(String gdtask) {
        this.gdtask = gdtask == null ? null : gdtask.trim();
    }

    public String getBsxtinstructordetailopinion() {
        return bsxtinstructordetailopinion;
    }

    public void setBsxtinstructordetailopinion(String bsxtinstructordetailopinion) {
        this.bsxtinstructordetailopinion = bsxtinstructordetailopinion == null ? null : bsxtinstructordetailopinion.trim();
    }
}