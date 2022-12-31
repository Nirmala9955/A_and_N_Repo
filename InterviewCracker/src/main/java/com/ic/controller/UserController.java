package com.ic.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ic.model.Role;
import com.ic.service.IRoleService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private IRoleService roleService;
	
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
