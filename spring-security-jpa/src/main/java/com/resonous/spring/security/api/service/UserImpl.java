package com.resonous.spring.security.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resonous.spring.security.api.model.User;
import com.resonous.spring.security.api.repository.UserRepository;

@Service
public class UserImpl {
	
	@Autowired
	UserRepository UserRepo;
	
	public List<User> findAll()
	{
		return UserRepo.findAll();
	}
	
	public User findByName(String username)
	{
		
		return UserRepo.findByUsername(username);
	}
	
	public User findById(Integer id)
	{
		return UserRepo.findById(id).get();
	}
	
	public void delete(Integer id)
	{
		 UserRepo.delete(UserRepo.findById(id).get());
	}
	
	
	public void save(User user)
	{
		UserRepo.save(user);
	}
	
	

}
