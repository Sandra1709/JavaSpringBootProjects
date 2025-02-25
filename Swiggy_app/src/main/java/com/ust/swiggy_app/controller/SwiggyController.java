package com.ust.swiggy_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ust.swiggy_app.Service.SwiggyService;
import com.ust.swiggy_app.model.Swiggy;

@RestController
@RequestMapping("/swiggy")
public class SwiggyController {
	@Autowired
	private SwiggyService serv;
	
	@GetMapping("/getAll")
	public List<Swiggy> getData()
	{
		return serv.getAllDetails();
	}
    @PostMapping("/addData")
    public Swiggy addDetails(@RequestBody Swiggy user)
    {
    	return serv. addDetails(user);
    }
}
