/**
* @author Ramanpreet Singh
*/
package com.learning.photoapp.api.users.ui.model;

/* Class acts a blueprint for the user response model */
public class CreateUserResponseModel {
	private String firstName;
	private String lastName;
	private String email;
	private String userId;
	
	/** 
	* @return firstName
	*/
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/** 
	* @return lastName
	*/
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
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
	* @return userId
	*/
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
