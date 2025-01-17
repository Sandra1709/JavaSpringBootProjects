package com.ust.rest.model;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@Entity
public class Product {
	@Id
	@GeneratedValue
	private long id;
	private String brand;
	private String description;
	private int qty;
	private int price;
	
	

}
