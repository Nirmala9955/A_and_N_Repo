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
	private Integer roleId;
	private String roleTitle;
	@Column(name = "is_active")
	private Integer isACtive;
}
