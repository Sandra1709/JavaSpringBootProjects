package com.ust.bootsecuritymysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.bootsecuritymysql.Repository.UserRespository;
import com.ust.bootsecuritymysql.model.MyUser;

@RestController
@RequestMapping("/register")
public class RegisterationController {
	@Autowired
	private UserRespository repo;
	
	@Autowired
       PasswordEncoder encoder;
	@PostMapping("/add")
	public MyUser newUser(@RequestBody MyUser user)
	{
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}

}
