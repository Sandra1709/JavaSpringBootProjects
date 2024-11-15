package com.ust.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.model.Product;
import com.ust.rest.repository.ProductRepository;

@Service
public class ProductService {
 @Autowired
  private ProductRepository  repo;
 public Product addProduct(Product prod)
 {
	 return repo.save(prod);
 }
}
