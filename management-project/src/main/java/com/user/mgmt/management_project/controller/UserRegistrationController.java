package com.user.mgmt.management_project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	
	@RestController
	public class UserRegistrationController {
		
		@RequestMapping("/newRegistration")
		public String index() {
			return "Start Registration.........!";
		}

}
