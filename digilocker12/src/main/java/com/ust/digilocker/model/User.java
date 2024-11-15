package com.ust.digilocker.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userid;
	private String username;
	private int age;
	private long  phone_no;
	
	 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	    private List<Govdoc> govdocs;

	    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	    private List<Certificate> certificates;

	    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	    private List<Bankdetails> bankdetails;
	

}
