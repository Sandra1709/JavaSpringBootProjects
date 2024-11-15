package com.ust.digilocker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Govdoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long govid;
	private  long aadhar;
	private String pan;
	private String license;
	
	@ManyToOne
    @JoinColumn(name = "userid")
    private User user;
	

}
