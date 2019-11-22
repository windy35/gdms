package com.gdms.crud.bean;
/**
 * 毕设查询条件
 * @author 周汶锋
 *
 */
public class GDQueryCondition {	
	private String xttm;
	private String jsbh;
	private String jsxm;
	private String tmlx;
	private String tmly;	
	private String shzt;
	private String type;		
	
	@Override
	public String toString() {
		return "GDQueryCondition [xttm=" + xttm + ", jsbh=" + jsbh + ", jsxm=" + jsxm + ", tmlx=" + tmlx + ", tmly="
				+ tmly + ", shzt=" + shzt + ", type=" + type + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getJsxm() {
		return jsxm;
	}
	public void setJsxm(String jsxm) {
		this.jsxm = jsxm;
	}
	public String getShzt() {
		return shzt;
	}
	public void setShzt(String shzt) {
		this.shzt = shzt;
	}
	public String getXttm() {
		return xttm;
	}
	public void setXttm(String xttm) {
		this.xttm = xttm;
	}
	public String getJsbh() {
		return jsbh;
	}
	public void setJsbh(String jsbh) {
		this.jsbh = jsbh;
	}
	public String getTmlx() {
		return tmlx;
	}
	public void setTmlx(String tmlx) {
		this.tmlx = tmlx;
	}
	public String getTmly() {
		return tmly;
	}
	public void setTmly(String tmly) {
		this.tmly = tmly;
	}
	
}
