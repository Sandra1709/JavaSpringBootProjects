package com.ust.bootsecuritymysql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class EmployeeController {
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
