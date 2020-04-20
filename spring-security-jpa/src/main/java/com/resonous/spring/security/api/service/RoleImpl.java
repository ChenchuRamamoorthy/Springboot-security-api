package com.resonous.spring.security.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resonous.spring.security.api.model.Role;
import com.resonous.spring.security.api.repository.RoleRepository;


@Service
public class RoleImpl {
	
	@Autowired
	RoleRepository RoleRepo;
	
	public List<Role> findAll()
	{
		return RoleRepo.findAll();
	}
	

	
	public Role findById(Integer id)
	{
		return RoleRepo.findById(id).get();
	}
	
	public void delete(Integer id)
	{
		RoleRepo.delete(RoleRepo.findById(id).get());
	}
	
	
	
	

}
