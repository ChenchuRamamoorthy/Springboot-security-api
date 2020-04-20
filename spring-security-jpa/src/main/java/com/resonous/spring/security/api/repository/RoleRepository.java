package com.resonous.spring.security.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resonous.spring.security.api.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
