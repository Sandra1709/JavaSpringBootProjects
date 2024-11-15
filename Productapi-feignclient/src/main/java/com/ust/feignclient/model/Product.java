package com.ust.feignclient.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private long id;
	private String brand;
	private String description;
	private int qty;
	private int price;
	
	

}
