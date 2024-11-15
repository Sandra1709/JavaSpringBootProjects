package com.ust.rest.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Certificates {
	@Id
	
	private long certid;
	private String certiname;
	private  long certinumber;

}
