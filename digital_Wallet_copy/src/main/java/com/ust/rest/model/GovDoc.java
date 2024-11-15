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
public class GovDoc {
	@Id
	
	private long govid;
	private String  aadhar;
	private String pan;
	private String license;

}
