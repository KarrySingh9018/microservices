/**
* @author Ramanpreet Singh
*/
package com.learning.photoapp.api.albums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //Registering the microservice as a client of Eureka Discovery
public class PhotoAppApiAlbumsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppApiAlbumsApplication.class, args);
	}

}

