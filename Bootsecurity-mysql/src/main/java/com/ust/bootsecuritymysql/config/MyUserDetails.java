package com.ust.bootsecuritymysql.config;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ust.bootsecuritymysql.model.MyUser;

public  class MyUserDetails implements UserDetails{
	private String username;
	private String password;
	private List<GrantedAuthority>authorities;
	public MyUserDetails (MyUser user)
	{
		username= user.getUsername();
		password= user.getPassword();
		authorities =Arrays.stream(user.getRole().split(","))
				     .map(SimpleGrantedAuthority::new)
				     .collect(Collectors.toList());
		
		//String role ="ADMIN,USER,OPS,HR"
		//converting a comma separated string into arraylist
				     
				
	
	
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	public boolean isAccountNonExpired() {
		return true;
	}
	public boolean isAccountNonLocked()
	{
		return true;
	}
	public boolean isCredentialsNonExpired()
	{
		return true;
	}
	public boolean isEnabled()
	{
		return true;
	}

}
