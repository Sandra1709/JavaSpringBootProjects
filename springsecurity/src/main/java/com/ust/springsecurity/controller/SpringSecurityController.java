package com.ust.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class SpringSecurityController {
	@GetMapping("/")
	public String greet()
	{
		return "hello welcome";
		
	}
     @GetMapping("/admin")
     
    	 public String admin()
    	 {
    		 return "Admin@work";
    	 }
     @GetMapping("/user")
     public String greetUser()
     {
    	 return "User@work";
     }
}
