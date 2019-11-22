package com.gdms.crud.bean;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String Username;
	private String Password;
	private String Role;
	private String VCCode;
	
	

	@Override
	public String toString() {
		return "User [Username=" + Username + ", Password=" + Password + ", Role=" + Role + ", VCCode=" + VCCode + "]";
	}
	
	
	public String getVCCode() {
		return VCCode;
	}


	public void setVCCode(String vCCode) {
		VCCode = vCCode;
	}


	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
}
