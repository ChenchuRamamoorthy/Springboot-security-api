package com.resonous.spring.security.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.resonous.spring.security.api.controller.AdminController;
import com.resonous.spring.security.api.service.UserImpl;

@SpringBootApplication
@ComponentScan(basePackageClasses = AdminController.class)
@ComponentScan(basePackageClasses = UserImpl.class)
@EnableAutoConfiguration 
public class SpringSecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaApplication.class, args);
	}

}
