package com.learning.photoapp.api.users.ui.model;

/* Class acts as a response model of Albums Entity */
public class AlbumResponseModel {

    private String albumId;
    private String userId; 
    private String name;
    private String description;
    	
	/**
	* @return albumId
	*/
	public String getAlbumId() {
		return albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
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
	/**
	* @return name
	*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	* @return description
	*/
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
    
	
}
