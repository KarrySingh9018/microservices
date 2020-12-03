package com.learning.photoapp.api.users.ui.model;

/* Class acts as blueprint for the User Login */
public class LoginRequestModel {
	private String email;
	private String password;
	
	/** 
	* @return email
	*/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	/** 
	* @return password
	*/
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
