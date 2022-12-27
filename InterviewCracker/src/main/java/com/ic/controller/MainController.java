package com.ic.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	private Logger logger = Logger.getLogger(MainController.class);
	
	@GetMapping({"/", "home"})
	public String showHome() {
		logger.debug("Inside showHome() method");
		return "index";
	}
	
	@GetMapping("contactus")
	public String showContactUs() {
		return "contact-us";
	}
	
	@GetMapping("services")
	public String showServices() {
		return "services";
	}
	
}
