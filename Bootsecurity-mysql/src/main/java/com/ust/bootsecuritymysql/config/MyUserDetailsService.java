package com.ust.bootsecuritymysql.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.bootsecuritymysql.Repository.UserRespository;
import com.ust.bootsecuritymysql.model.MyUser;

@Service

public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	 private UserRespository repoo;
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		Optional<MyUser> user =repoo.findByUsername(username);
		System.out.println(user.get().getUsername());
		
			return user.map(MyUserDetails::new)
			
		.orElseThrow(()-> new UsernameNotFoundException("Username Not found"+username));
		
	}
	

}
