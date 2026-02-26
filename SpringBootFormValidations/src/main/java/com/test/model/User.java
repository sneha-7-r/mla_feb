package com.test.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {
	@NotEmpty(message="username required")
	private String username;
	
	@Size(min=7,max=16)
	@NotEmpty(message="password required")
	private String password;
	
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
	
	

}
