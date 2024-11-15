package com.ust.digilocker.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.digilocker.model.User;
import com.ust.digilocker.service.DigilockerService;

@RestController
@RequestMapping("/digi/locker1.0")

public class DigiLockerController {
	@Autowired
	private DigilockerService serv;
	
	@GetMapping("/allinfo")//all datas will be accessed
	public List<User> getData()
	{
		return serv.getalldata();
	}
	@GetMapping("/user/{userid}")//data accessed using id
	public ResponseEntity<Optional<User>> getByUserName(@PathVariable long userid)
	{
		Optional<User> use =serv.getByUserid(userid);
		if(use!=null)
		{
			return ResponseEntity.ok(use);
    } else {
        return ResponseEntity.notFound().build();
    }
	//	------------------------------------------------------GetMapping----------------------------------
		
	}
	@PostMapping("/addData")
	public User addData(@RequestBody User user)
	{
		return serv.addDetails(user);
		
	}

}
