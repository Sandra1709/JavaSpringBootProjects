package com.ust.bootsecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.bootsecurity.repository.UserRespository;

@Service

public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	 private UserRespository repoo;
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		Optional<MyUser> user =repoo.findByUsername(username);
		if(user.isPresent())
		{
			return loadUserByUsername(username);
			
		}
		else
		{
			throw new UsernameNotFoundException(username);
		}
	}
	

}
