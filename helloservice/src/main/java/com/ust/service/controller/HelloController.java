package com.ust.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")

public class HelloController {
	@Autowired
	Environment environment;//using this environment we can dynamically retrieve and return server port in response to GET Mappping
	
	@GetMapping()
	public String confirm()
	{
		return "from port#"+environment.getProperty("local.server.port");
	}

}
