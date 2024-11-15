package com.ust.swiggy_app.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Swiggy {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String location;
	private String fooditem;
	private String shopp;
	

}
