package com.resonous.spring.security.api.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.resonous.spring.security.api.model.Role;
import com.resonous.spring.security.api.model.User;
@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserImpl userImpl;
	
	@Transactional
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userImpl.findByName(username);
		CustomUserDetails userDetails = null;
		if (user != null) {
			System.out.println("userName"+user.getUsername());
			userDetails = new CustomUserDetails();
			userDetails.setUser(user);
		} else {
			throw new UsernameNotFoundException("User not exist with name : " + username);
		}
		return userDetails;

	}

	
}
