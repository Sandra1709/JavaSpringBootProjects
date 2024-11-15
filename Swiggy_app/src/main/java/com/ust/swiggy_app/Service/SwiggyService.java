package com.ust.swiggy_app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ust.swiggy_app.model.Swiggy;
import com.ust.swiggy_app.repository.SwiggyRepository;

@Service
public class SwiggyService {
@Autowired
private SwiggyRepository repo;

public List<Swiggy>getAllDetails()
{
	return repo.findAll();
}
public Swiggy addDetails(Swiggy user)
{
	return repo.save(user);
}
}
