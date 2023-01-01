package com.ic.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ic.model.Role;
import com.ic.service.IRoleService;

@Controller
public class MainController {
	
	private Logger logger = Logger.getLogger(MainController.class);
	
	@Autowired
	private IRoleService roleService;
	
	@GetMapping({"/", "/home"})
	public String showHome() {
		logger.debug("Inside showHome() method");
		return "index";
	}
	
	@GetMapping("/contactus")
	public String showContactUs() {
		logger.debug("Inside showContactUs() method");
		return "contact-us";
	}
	
	@GetMapping("/services")
	public String showServices() {
		logger.debug("Inside showServices() method");
		return "services";
	}
	
	@GetMapping("/login")
	public String showLogin() {
		logger.debug("Inside showLogin() method");
		return "login";
	}
	
	@GetMapping("/register")
	public String showRegister() {
		logger.debug("Inside showRegister() method");
		return "login";
	}

	@GetMapping("/roles")
	@ResponseBody
	public List<Role> fetchRoles() {
		logger.debug("Inside fetchRoles() method");
		//Invoking service method
		List<Role> roleList = roleService.getRoles();
		logger.info("Role list - "+roleList);
		return roleList;
	}
	
}
