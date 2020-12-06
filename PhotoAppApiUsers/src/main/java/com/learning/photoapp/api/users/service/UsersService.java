/**
* @author Ramanpreet Singh
*/
package com.learning.photoapp.api.users.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.learning.photoapp.api.users.shared.UserDto;

/**
* @see UserDetailsService
* Interface provides with methods used for querying repository
* using the methods provided in UserDetailsService interface. 
*/
public interface UsersService extends UserDetailsService{
	UserDto createUser(UserDto userDetails);
	UserDto getUserDetailsByEmail(String email);
	UserDto getUserByUserId(String userId);
}
