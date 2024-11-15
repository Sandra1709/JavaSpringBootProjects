package com.ust.feignclient.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.feignclient.model.Product;

@FeignClient(value = "feignclient",url="http://localhost:8091/product/api1.0")
public interface ProductFeignInterface {
	@GetMapping("/productsinfo")
	public List<Product>getAllProducts();
	@GetMapping("/product/{id}")
	public String getById(@PathVariable long id );
	@GetMapping("/product/Brand/{brand}")
	public List<Product> getByBrand(@PathVariable String brand );
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable long id);
	@PostMapping("/addProduct")
	public  Product addproduct(@RequestBody Product prod);
	@PutMapping("/modify")
	public String updateProduct(@RequestBody Product product);

}
