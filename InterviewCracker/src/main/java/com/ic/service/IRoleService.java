package com.ic.service;

import java.util.List;

import com.ic.model.ProjectRole;
import com.ic.model.Role;

public interface IRoleService {

	public List<Role> getRoles();

	public List<ProjectRole> getProjectRoles();

}
