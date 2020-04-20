package com.resonous.spring.security.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Role {
	
	@Id
	@GeneratedValue
	private int role_id;
	private String role;

}
