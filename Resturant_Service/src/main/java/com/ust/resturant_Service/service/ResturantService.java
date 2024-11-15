package com.ust.resturant_Service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.resturant_Service.Repository.ResturantRepository;
import com.ust.resturant_Service.model.Resturant;


@Service
public class ResturantService {
	@Autowired
	private ResturantRepository repo;
	public List<Resturant>getAllDetails()
	{
		return repo.findAll();
	}
	public Resturant addDetails(Resturant user)
	{
		return repo.save(user);
	}

}
