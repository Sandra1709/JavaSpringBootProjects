package com.ust.rest.controller;


import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.model.Product;
import com.ust.rest.service.ProductService;

@RestController
@RequestMapping("/product/api1.0")//root of the resource/controller

public class ProductController {
	@Autowired
	private ProductService service;
	Logger logger =Logger.getLogger("ProductController.class");
	
	
	@GetMapping(value="/product/{id}")
	public ResponseEntity <Product>getById(@PathVariable long id)
	{
		
		return null;
		}
	@GetMapping(value="/prod/{brand}")
	public ResponseEntity <Product>getByBrand(@PathVariable String brand)
	{
		
		return null;
		}
@GetMapping(value="/productsinfo",produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity <List<Product>> displayProducts()
{
	return null;
	
}
@PostMapping(value="/addProduct")
public  ResponseEntity<Product> addProduct(@RequestBody Product prod)
{
	 logger.info("Entered PostMethod"+prod);
     Product savedproduct = service.addProduct(prod); 
     logger.info("Persisted product"+savedproduct);
	return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(savedproduct);
	}
@PutMapping(value="/modify")
public  ResponseEntity<Product> updateProduct(@RequestBody Product prod)
{

	
	         return null;
}
@DeleteMapping(value="/delete/{id}")
public void  removeProduct(@PathVariable long id)
{
	
	
}

}