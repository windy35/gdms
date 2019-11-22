package com.gdms.crud.bean;

public class Admin {
    private String adminid;

    private String adminname;

    private String password;

    private String email;

    private String phone;

    private String nowaccesstime;

    private String lastaccesstime;

    private Integer accesscount;

    private String nowaccessipaddress;

    private String lastaccessipaddress;

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid == null ? null : adminid.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getNowaccesstime() {
        return nowaccesstime;
    }

    public void setNowaccesstime(String nowaccesstime) {
        this.nowaccesstime = nowaccesstime == null ? null : nowaccesstime.trim();
    }

    public String getLastaccesstime() {
        return lastaccesstime;
    }

    public void setLastaccesstime(String lastaccesstime) {
        this.lastaccesstime = lastaccesstime == null ? null : lastaccesstime.trim();
    }

    public Integer getAccesscount() {
        return accesscount;
    }

    public void setAccesscount(Integer accesscount) {
        this.accesscount = accesscount;
    }

    public String getNowaccessipaddress() {
        return nowaccessipaddress;
    }

    public void setNowaccessipaddress(String nowaccessipaddress) {
        this.nowaccessipaddress = nowaccessipaddress == null ? null : nowaccessipaddress.trim();
    }

    public String getLastaccessipaddress() {
        return lastaccessipaddress;
    }

    public void setLastaccessipaddress(String lastaccessipaddress) {
        this.lastaccessipaddress = lastaccessipaddress == null ? null : lastaccessipaddress.trim();
    }
}