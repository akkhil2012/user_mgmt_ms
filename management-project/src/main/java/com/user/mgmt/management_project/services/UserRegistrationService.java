package com.user.mgmt.management_project.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

	
	@SpringBootApplication
	@ComponentScan("com.user.mgmt.management_project.controller")
	public class UserRegistrationService {
		public static void main(String[] args) {
			System.setProperty("server.servlet.context-path", "/registrationService");
			System.setProperty("spring.config.name", "registration-server");
			SpringApplication.run(UserMgmtService.class, args);
		}
		
		

	}


