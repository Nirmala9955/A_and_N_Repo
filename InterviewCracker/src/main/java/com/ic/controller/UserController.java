package com.ic.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger logger = Logger.getLogger(UserController.class);	
	
	@GetMapping("/getBasicInformation")
	public void getBasicInformation(@RequestParam int userId) {
		logger.debug("Inside getBasicInformation() method");
	}
	
	@GetMapping("/getEducationInformation")
	public void getEducationInformation(@RequestParam int userId) {
		logger.debug("Inside getEducationInformation() method");
	}
	
	@GetMapping("/getContactInformation")
	public void getContactInformation(@RequestParam int userId) {
		logger.debug("Inside getContactInformation() method");
	}
	
}
