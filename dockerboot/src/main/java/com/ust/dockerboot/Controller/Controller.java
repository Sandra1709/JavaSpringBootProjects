package com.ust.dockerboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
	@GetMapping("/greets")
	public String message()
	{
		return "Ola!!!..Come on..";
	}

}
