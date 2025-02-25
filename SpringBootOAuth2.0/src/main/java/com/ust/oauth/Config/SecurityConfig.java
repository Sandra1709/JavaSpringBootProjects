package com.ust.oauth.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity

public class SecurityConfig {
	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception
	{
	return http
			  .authorizeHttpRequests(registry->{
				       registry.anyRequest().authenticated();})
			  .oauth2Login(Customizer.withDefaults())
			  .build();
			  

}
}
