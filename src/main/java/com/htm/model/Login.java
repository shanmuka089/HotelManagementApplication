package com.htm.model;

import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

public class Login {
	
	@NotBlank(message = "*user name cannot be blank")
	private String username;
	
	@NotBlank(message = "*password cannot be blank")
	private String password;
	
	@NotBlank(message = "* please re-enter your password")
	private String password2;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

}
