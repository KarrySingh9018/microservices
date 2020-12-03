package com.learning.photoapp.api.users.ui.controllers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.photoapp.api.users.service.*;
import com.learning.photoapp.api.users.shared.*;
import com.learning.photoapp.api.users.ui.model.CreateUserRequestModel;
import com.learning.photoapp.api.users.ui.model.CreateUserResponseModel;
import com.learning.photoapp.api.users.ui.model.UserResponseModel;

@RestController // Annotation used for denoting class as REST controller which has Response Body
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	UsersService usersService;

	@GetMapping("/status/check")
	public String status()
	{
		return "Working on port " + env.getProperty("local.server.port") + ", with token = " + env.getProperty("token.secret");
	}
 	
	/**
	* @param userDetails object of CreateUserRequestModel
	* @return CreateUserResponseModel as ResponseEntity
	* Method creates a response object based on the details passed as PostRequest
	* and captured by the @RequestBody annotation.
	*/
	@PostMapping(
			consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
			produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }
			)
	public ResponseEntity<CreateUserResponseModel> createUser(@RequestBody CreateUserRequestModel userDetails)
	{
		ModelMapper modelMapper = new ModelMapper(); 
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserDto userDto = modelMapper.map(userDetails, UserDto.class);
		
		UserDto createdUser = usersService.createUser(userDto);
		
		CreateUserResponseModel returnValue = modelMapper.map(createdUser, CreateUserResponseModel.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
	}
	
	/**
	* @param userId as a path-variable for in the URI
	* @return ResponseEntity object
	* Method returns a user object by querying the repository using
	* service method based on argument userId.
	*/
	@GetMapping(value="/{userId}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserResponseModel> getUser(@PathVariable("userId") String userId) {

		UserDto userDto = usersService.getUserByUserId(userId); 
		UserResponseModel returnValue = new ModelMapper().map(userDto, UserResponseModel.class);

		return ResponseEntity.status(HttpStatus.OK).body(returnValue);
        }
	
	
}
