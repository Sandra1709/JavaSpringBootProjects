package com.ust.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readprops")
public class UserConfigController {
	@Value("${server.port.key}")
	String serverPort;
	@Value("${spring.application.name}")
	String appName;
	@Value("${message}")
	String message;
	@GetMapping
	public String showProps()
	{
		return "port= "+serverPort+"AppName"+appName+ "MESSAGE :"+message;
		
	}

}
