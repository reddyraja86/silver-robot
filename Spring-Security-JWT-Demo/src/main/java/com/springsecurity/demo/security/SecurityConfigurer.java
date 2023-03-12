package com.springsecurity.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfigurer {

	@Autowired
	UserDetailService userDetailService;
	
	@Bean
	public AuthenticationManager authenticationManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder,UserDetailService userDetailService) throws Exception {
		//TODO : Skip the urs which doesnt need the token for example 
		return http.getSharedObject(AuthenticationManagerBuilder.class)
				.userDetailsService(userDetailService)
				.passwordEncoder(bCryptPasswordEncoder)
				.and()
				.build();
	}
	

	
}
