package com.ic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ic.model.Role;

public interface IRolesRepo extends JpaRepository<Role, Integer> {

}
