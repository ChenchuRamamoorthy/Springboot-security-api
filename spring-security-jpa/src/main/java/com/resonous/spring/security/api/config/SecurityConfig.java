package com.resonous.spring.security.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig/* extends WebSecurityConfigurerAdapter */ {

//	@Autowired
//	UserDetailsService userDetailsService;
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//		auth.userDetailsService(userDetailsService).passwordEncoder(encodePWD());
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// TODO Auto-generated method stub
//		http.csrf().disable();
//
//		
//
//		http.httpBasic().and().authorizeRequests().antMatchers("/rest/**").permitAll().and().authorizeRequests()
//				.antMatchers("/secure/**").hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin()
//				.permitAll();
//
//	}
//
//	@Bean
//	public BCryptPasswordEncoder encodePWD() {
//		return new BCryptPasswordEncoder();
//	}
}
