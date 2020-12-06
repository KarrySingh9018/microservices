/**
* @author Ramanpreet Singh
*/
package com.learning.photoapp.api.users.shared;

import java.io.Serializable;
import java.util.List;

import com.learning.photoapp.api.users.ui.model.AlbumResponseModel;

/* Class is shared among all the components of the application 
and is used to transfer data among them. */
public class UserDto implements Serializable {
	
	private static final long serialVersionUID = -953297098295050686L;
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userId;
	private String encryptedPassword;
	private List<AlbumResponseModel> albums;
	
	/**
	* @return firstName
	*/
	public String getFirstName() {
		return firstName;
	}
	
	/** 
	* @param firstName to set firstName
	*/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
        /**
	* @return lastName
	*/
	public String getLastName() {
		return lastName;
	}
	
	/** 
	* @param lastName to set lastName
	*/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	* @return email
	*/
	public String getEmail() {
		return email;
	}
	
	/** 
	* @param email to set email
	*/
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	* @return password
	*/
	public String getPassword() {
		return password;
	}
	
	/** 
	* @param password to set password
	*/
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	* @return userId
	*/
	public String getUserId() {
		return userId;
	}

	/** 
	* @param userId to set userId
	*/
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	* @return encryptedPassword
	*/
	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	/** 
	* @param encryptedPassword to set encryptedPassword
	*/
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	
	/**
	* @return albums
	*/
	public List<AlbumResponseModel> getAlbums() {
		return albums;
	}
	
	/** 
	* @param albums to set albums
	*/
	public void setAlbums(List<AlbumResponseModel> albums) {
		this.albums = albums;
	}

}
