package com.ic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "project_role")
public class ProjectRole {
	@Id
	@Column(name = "roleId")
	private Integer roleId;
	@Column(name = "roleTitle")
	private String roleTitle;
	@Column(name = "isActive")
	private Integer isACtive;
}
