package com.ust.factorilservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial/service")
public class FactorialServiceController {
	@GetMapping("/value/{id}")
	public int firm(@PathVariable int id)
	{
		int factorial =1;
		if(id==0)
			return 1;
		else
		{
		
     

        for (int i = 1; i <= id; i++) {
            factorial *= i;
        }
		}
		return factorial;
	}

}
