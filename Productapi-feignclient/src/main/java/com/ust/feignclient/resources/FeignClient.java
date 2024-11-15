package com.ust.feignclient.resources;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.feignclient.interfaces.ProductFeignInterface;
import com.ust.feignclient.model.Product;

@RestController
@RequestMapping("/client")
public class FeignClient {
	@Autowired
	private ProductFeignInterface feignclient;
	@GetMapping("/productsinfo")//display all product
	public List<Product>getAll()
	{
		return feignclient.getAllProducts();
	}
	@GetMapping("/product/{id}")// get data by id
	public String getId(@PathVariable long id )
	{
		return feignclient.getById(id);
	}
	@GetMapping("/product/Brand/{brand}")//get data by brand name
	public List<Product> getBrand(@PathVariable String brand)
	{
		return feignclient.getByBrand(brand);
	}
	@DeleteMapping("/delete/{id}")//delete data by id
	public String deleteId(@PathVariable long id)
	{
		return feignclient.deleteById(id);
	}
	@PostMapping("/addProduct")
	public  Product adddata(@RequestBody Product prod)
	{
		return feignclient.addproduct(prod);
	}
	@PutMapping("/modify")
	public String updatedata(@RequestBody Product product)
	{
		return feignclient.updateProduct(product);
	}

	

}
