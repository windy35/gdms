package com.gdms.crud.bean;

public class Student {
    private String studentid;

    private String name;

    private Integer graduationgradeid;

    private String gender;

    private Integer age;

    private Integer classid;

    private String politicallandscape;

    private String phone;

    private String email;

    private String qq;

    private String wechat;

    private String instrutorid;

    private Integer graduationdesignid;

    private String photoPath;

    private String birthday;

    private String idcard;

    private String nowaccesstime;

    private String lastaccesstime;

    private Integer accesscount;

    private String nowaccessipaddress;

    private String lastaccessipaddress;

    private String password;

    private Integer ktbgid;

    private Integer zqjcbid;

    private Integer zdjlid;

    private Integer bylwid;

    private Integer dbpptid;

    private Integer wwywhyjid;

    private Integer graduationdesignresultid;

    private Integer departmentid;

    private Integer majorid;

    private Integer gradeid;

    private Class classes;
    
    private Grade grade;        

    private Teacher instructor;  
    
    private GraduationdesignWithBLOBs graduationdesign;    
    
    private GraduationdesignresultWithBLOBs graduationdesignresult;        
    
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", graduationgradeid=" + graduationgradeid
				+ ", gender=" + gender + ", age=" + age + ", classid=" + classid + ", politicallandscape="
				+ politicallandscape + ", phone=" + phone + ", email=" + email + ", qq=" + qq + ", wechat=" + wechat
				+ ", instrutorid=" + instrutorid + ", graduationdesignid=" + graduationdesignid + ", photoPath="
				+ photoPath + ", birthday=" + birthday + ", idcard=" + idcard + ", nowaccesstime=" + nowaccesstime
				+ ", lastaccesstime=" + lastaccesstime + ", accesscount=" + accesscount + ", nowaccessipaddress="
				+ nowaccessipaddress + ", lastaccessipaddress=" + lastaccessipaddress + ", password=" + password
				+ ", ktbgid=" + ktbgid + ", zqjcbid=" + zqjcbid + ", zdjlid=" + zdjlid + ", bylwid=" + bylwid
				+ ", dbpptid=" + dbpptid + ", wwywhyjid=" + wwywhyjid + ", graduationdesignresultid="
				+ graduationdesignresultid + ", departmentid=" + departmentid + ", majorid=" + majorid + ", gradeid="
				+ gradeid + ", classes=" + classes + ", grade=" + grade + ", instructor=" + instructor
				+ ", graduationdesign=" + graduationdesign + ", graduationdesignresult=" + graduationdesignresult + "]";
	}

	public Class getClasses() {
		return classes;
	}

	public void setClasses(Class classes) {
		this.classes = classes;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Teacher getInstructor() {
		return instructor;
	}

	public void setInstructor(Teacher instructor) {
		this.instructor = instructor;
	}

	public GraduationdesignWithBLOBs getGraduationdesign() {
		return graduationdesign;
	}

	public void setGraduationdesign(GraduationdesignWithBLOBs graduationdesign) {
		this.graduationdesign = graduationdesign;
	}

	public GraduationdesignresultWithBLOBs getGraduationdesignresult() {
		return graduationdesignresult;
	}

	public void setGraduationdesignresult(GraduationdesignresultWithBLOBs graduationdesignresult) {
		this.graduationdesignresult = graduationdesignresult;
	}

	public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGraduationgradeid() {
        return graduationgradeid;
    }

    public void setGraduationgradeid(Integer graduationgradeid) {
        this.graduationgradeid = graduationgradeid;
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

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getPoliticallandscape() {
        return politicallandscape;
    }

    public void setPoliticallandscape(String politicallandscape) {
        this.politicallandscape = politicallandscape == null ? null : politicallandscape.trim();
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

    public String getInstrutorid() {
        return instrutorid;
    }

    public void setInstrutorid(String instrutorid) {
        this.instrutorid = instrutorid == null ? null : instrutorid.trim();
    }

    public Integer getGraduationdesignid() {
        return graduationdesignid;
    }

    public void setGraduationdesignid(Integer graduationdesignid) {
        this.graduationdesignid = graduationdesignid;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getKtbgid() {
        return ktbgid;
    }

    public void setKtbgid(Integer ktbgid) {
        this.ktbgid = ktbgid;
    }

    public Integer getZqjcbid() {
        return zqjcbid;
    }

    public void setZqjcbid(Integer zqjcbid) {
        this.zqjcbid = zqjcbid;
    }

    public Integer getZdjlid() {
        return zdjlid;
    }

    public void setZdjlid(Integer zdjlid) {
        this.zdjlid = zdjlid;
    }

    public Integer getBylwid() {
        return bylwid;
    }

    public void setBylwid(Integer bylwid) {
        this.bylwid = bylwid;
    }

    public Integer getDbpptid() {
        return dbpptid;
    }

    public void setDbpptid(Integer dbpptid) {
        this.dbpptid = dbpptid;
    }

    public Integer getWwywhyjid() {
        return wwywhyjid;
    }

    public void setWwywhyjid(Integer wwywhyjid) {
        this.wwywhyjid = wwywhyjid;
    }

    public Integer getGraduationdesignresultid() {
        return graduationdesignresultid;
    }

    public void setGraduationdesignresultid(Integer graduationdesignresultid) {
        this.graduationdesignresultid = graduationdesignresultid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }
}