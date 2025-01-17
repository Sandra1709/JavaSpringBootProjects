package com.ust.resturant_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ResturantServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResturantServiceApplication.class, args);
	}

}
