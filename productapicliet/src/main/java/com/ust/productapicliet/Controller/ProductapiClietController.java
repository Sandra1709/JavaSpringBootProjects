package com.ust.productapicliet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.productapicliet.Repository.ProductapiclietRepository;

@RestController
@RequestMapping("/productapi/cliet")

public class ProductapiClietController {
	@Autowired
	private ProductapiclietRepository repo;
	
	

}
