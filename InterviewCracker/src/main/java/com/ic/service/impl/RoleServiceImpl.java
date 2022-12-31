package com.ic.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ic.model.Role;
import com.ic.repository.IRolesRepo;
import com.ic.service.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService {

	private Logger logger = Logger.getLogger(RoleServiceImpl.class);
	
	@Autowired
	private IRolesRepo rolesRepo;
	
	@Override
	public List<Role> getRoles() {
		logger.debug("Inside getRoles() method");
		return rolesRepo.findAll();
	}

}
