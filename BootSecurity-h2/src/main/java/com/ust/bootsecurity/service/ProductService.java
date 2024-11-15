package com.ust.bootsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.bootsecurity.model.Product;
import com.ust.bootsecurity.repository.ProductRepository;

@Service
public class ProductService {
 @Autowired
  private ProductRepository  repo;
 public Product addProduct(Product prod)
 {
	 return repo.save(prod);
 }
}
