package com.user.mgmt.management_project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.*;  
import javax.mail.internet.*;

import java.util.Properties;

import javax.activation.*; 

	
	@RestController
	public class NotificationController {
		
		@PostMapping("/newApprovalNotification")
		public String index() {
			  String to = "akkhil2012@gmail.com";//change accordingly  
		      String from = "akkhil2012@gmail.com";
		      String host = "localhost";//or IP address  
		  
		     //Get the session object  
		      Properties properties = System.getProperties();  
		      properties.setProperty("mail.smtp.host", "127.0.0.1");  
		      Session session = Session.getDefaultInstance(properties);  
		  
		     //compose the message  
		      try{  
		         MimeMessage message = new MimeMessage(session);  
		         message.setFrom(new InternetAddress(from));  
		         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		         message.setSubject("Ping................");  
		         message.setText("Hello, this is example of sending email  ");  
		  
		         // Send message  
		         Transport.send(message);  
		         System.out.println("message sent successfully....");  
		  
		      }catch (MessagingException mex) {
		    	  mex.printStackTrace();
		    }  
		     
			return "SendingNotification.........!";
		}

}
