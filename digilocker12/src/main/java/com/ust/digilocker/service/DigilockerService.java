package com.ust.digilocker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.digilocker.Repository.DigilockerRepo;
import com.ust.digilocker.model.User;

@Service
public class DigilockerService {
	@Autowired
	private DigilockerRepo repo;

	public List<User> getalldata() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	public Optional<User> getByUserid(long userid)
	{
		return repo.findById(userid);
	}
	public User addDetails(User user)
	{
		return repo.save(user);
	}

}
