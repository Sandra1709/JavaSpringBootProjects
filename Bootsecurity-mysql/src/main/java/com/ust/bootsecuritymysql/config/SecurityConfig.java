package com.ust.bootsecuritymysql.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Autowired
	private MyUserDetailsService userDetailsService;

	@Bean
SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
{
	return http.csrf(AbstractHttpConfigurer::disable).authorizeHttpRequests(registry->{
	registry.requestMatchers("/","/register/add/**").permitAll();
    registry.requestMatchers("/admin/**").hasRole("ADMIN");
    registry.requestMatchers("/user/**").hasRole("USER");
    registry.anyRequest().authenticated();
}).formLogin(AbstractAuthenticationFilterConfigurer::permitAll)
			.build();
}
	//@Bean
//	InMemoryUserDetailsManager userDetailsService()
//	{
//		UserDetails userDetails =User.builder().
//				                     username("bean").
//				                     password(passwordEncoder().encode("mister")).roles("USER").build();
//		UserDetails adminDetails =User.builder().
//                username("bond").
//                password(passwordEncoder().encode("james")).roles("ADMIN").build();
//		return new InMemoryUserDetailsManager(userDetails,adminDetails);    
//}
	@Bean
	public static PasswordEncoder  passwordEncoder()
	{
		return new BCryptPasswordEncoder();
		
	}
//	@Bean
//	public UserDetailsService userDetailsService()
//	{
//		return userDetailsService;
//	}
	@Bean
	public AuthenticationManager  authenticationProvider()
	{
		DaoAuthenticationProvider provider =new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(passwordEncoder());
		return  new ProviderManager(provider);
	}
	@Bean
	public AuthenticationManager authenticationMangaer2(AuthenticationConfiguration authenticationConfiguration) throws Exception
	{
		return authenticationConfiguration.getAuthenticationManager();
	}

}

