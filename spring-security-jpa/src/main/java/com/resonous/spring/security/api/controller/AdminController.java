package com.resonous.spring.security.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resonous.spring.security.api.model.User;
import com.resonous.spring.security.api.service.UserImpl;

@RestController
@RequestMapping("/secure/auth/")
public class AdminController {

	
	//only admin can add a user and assign roles
	@Autowired
	UserImpl userImpl;
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	//@PreAuthorize("hasAnyRole('ADMIN')")
	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody User user)
	{
		System.out.println("inside post method");
		String password = user.getPassword();
		String encryptPwd =encoder.encode(password);
		user.setPassword(encryptPwd);
		userImpl.save(user);
		
		return "user added successfully...";
	}
}
