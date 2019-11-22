package com.gdms.crud.bean;

public class Password {
	private String OldPassword;
	private String NewPassword;
	private String ComfirmPassword;
	public String getOldPassword() {
		return OldPassword;
	}
	public void setOldPassword(String oldPassword) {
		OldPassword = oldPassword;
	}
	public String getNewPassword() {
		return NewPassword;
	}
	public void setNewPassword(String newPassword) {
		NewPassword = newPassword;
	}
	public String getComfirmPassword() {
		return ComfirmPassword;
	}
	public void setComfirmPassword(String comfirmPassword) {
		ComfirmPassword = comfirmPassword;
	}
	@Override
	public String toString() {
		return "Password [OldPassword=" + OldPassword + ", NewPassword=" + NewPassword + ", ComfirmPassword="
				+ ComfirmPassword + "]";
	}
	
	
}
