package com.ust.bootdocker.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
	@GetMapping("/greet")
	public String message()
	{
		return "ola!!! Come on..";
	}

}
