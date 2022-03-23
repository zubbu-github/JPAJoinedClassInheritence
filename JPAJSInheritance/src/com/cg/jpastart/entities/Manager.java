package com.cg.jpastart.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mgr_store2")
public class Manager extends Employee{

private static final long serialVersionUID = 1L;
	
	private String departmentname;

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	
}

