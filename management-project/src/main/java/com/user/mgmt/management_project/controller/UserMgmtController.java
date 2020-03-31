package com.user.mgmt.management_project.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserMgmtController {
	
	@RequestMapping("/userRegistration")
	public void index() throws JSONException {
	//	return "Greetings from Spring Boot!";
		/*
		 * 
		 * Navigate to a Page that will fill in details and send POST call to another microserrvice: UserregistrationService
		 */
		HttpHeaders headers = new HttpHeaders();
		JSONObject personJsonObject = new JSONObject();
	    personJsonObject.put("id", 1);
	    personJsonObject.put("name", "John");
		HttpEntity<String> request = 
			      new HttpEntity<String>(personJsonObject.toString(), headers);
		RestTemplate  restTemplate = new RestTemplate();
		
		System.out.println("Before calling the Registration Service");
		restTemplate.postForObject("http://localhost:1111/registrationService/newRegistration", request, String.class);
		System.out.println("After  calling the Registration Service");
	}
	
	
	@RequestMapping("/")
	public String indexDefault() {
		return "Greetings from Spring Boot! : Home Page";
	}
	
	
	
	
	
	/*
	    @Autowired
	    private EmployeeDAO employeeDao;
	     
	    @GetMapping(path="/", produces = "application/json")
	    public Employees getEmployees() 
	    {
	        return employeeDao.getAllEmployees();
	    }*/

}
