package com.ust.bootsecurity.service;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class MyUser {
	@Id
	@GeneratedValue
	 private long id;
	private String username;
	private String password;
	private String role;

}
