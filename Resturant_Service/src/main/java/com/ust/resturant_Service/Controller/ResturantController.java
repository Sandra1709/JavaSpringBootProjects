package com.ust.resturant_Service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.resturant_Service.model.Resturant;
import com.ust.resturant_Service.service.ResturantService;


@RestController
@RequestMapping("/resturant")
public class ResturantController {
	@Autowired
	private ResturantService serv;
	

	@GetMapping("/getAll")
	public List<Resturant> getData()
	{
		return serv.getAllDetails();
	}
    @PostMapping("/addData")
    public Resturant addDetails(@RequestBody Resturant user)
    {
    	return serv. addDetails(user);
    }

}
