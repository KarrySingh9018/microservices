/**
* @author Ramanpreet Singh
*/
package com.learning.photoapp.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/* @EnableZuulProxy turns the gateway into reverse proxy and forwards
incoming requests to another services */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy 
public class PhotoAppApiZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppApiZuulApiGatewayApplication.class, args);
	}

}
