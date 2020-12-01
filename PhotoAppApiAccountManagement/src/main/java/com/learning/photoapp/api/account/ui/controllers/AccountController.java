package com.learning.photoapp.api.account.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    
    //HTTP Get EndPoint
    @GetMapping("/status/check")
    public String status() {
        return "Working..";
    }
	
    //HTTP Post EndPoint
    @PostMapping("/status/check")
    public String status() {
        return "Working..";
    }
	
}
