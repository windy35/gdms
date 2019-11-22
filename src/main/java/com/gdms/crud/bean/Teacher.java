package com.gdms.crud.bean;

public class Teacher {
    private String teacherid;

    private String name;

    private String gender;

    private Integer age;

    private Integer departmentid;

    private String politicallandscape;

    private String positionaltitle;

    private String positionallevel;

    private String phone;

    private String email;

    private String qq;

    private String wechat;

    private String photoPath;

    private String birthday;

    private String idcard;

    private Boolean pLeaderidSign;

    private String password;

    private String nowaccesstime;

    private String lastaccesstime;

    private Integer accesscount;

    private String nowaccessipaddress;

    private String lastaccessipaddress;

    private Boolean choosexnsign;

    private Integer fzzybh;

    private Department department;
    
    private Major fzzy;
    
    
	public Major getFzzy() {
		return fzzy;
	}

	public void setFzzy(Major fzzy) {
		this.fzzy = fzzy;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getPoliticallandscape() {
        return politicallandscape;
    }

    public void setPoliticallandscape(String politicallandscape) {
        this.politicallandscape = politicallandscape == null ? null : politicallandscape.trim();
    }

    public String getPositionaltitle() {
        return positionaltitle;
    }

    public void setPositionaltitle(String positionaltitle) {
        this.positionaltitle = positionaltitle == null ? null : positionaltitle.trim();
    }

    public String getPositionallevel() {
        return positionallevel;
    }

    public void setPositionallevel(String positionallevel) {
        this.positionallevel = positionallevel == null ? null : positionallevel.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath == null ? null : photoPath.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Boolean getpLeaderidSign() {
        return pLeaderidSign;
    }

    public void setpLeaderidSign(Boolean pLeaderidSign) {
        this.pLeaderidSign = pLeaderidSign;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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

    public Boolean getChoosexnsign() {
        return choosexnsign;
    }

    public void setChoosexnsign(Boolean choosexnsign) {
        this.choosexnsign = choosexnsign;
    }

    public Integer getFzzybh() {
        return fzzybh;
    }

    public void setFzzybh(Integer fzzybh) {
        this.fzzybh = fzzybh;
    }
}