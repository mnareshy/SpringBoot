package com.springboottest.coe;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class COE {
	
	public COE(String name, String noOfEmps, String description, String primaryTechnology) {
		super();
		this.name = name;
		this.noOfEmps = noOfEmps;
		this.description = description;
		this.primaryTechnology = primaryTechnology;
	}
	
	public COE() {
		super();
	
	}
	
	
	@Id
	private String name;
	private String noOfEmps;
	private String description;
	private String primaryTechnology;
	
	@ElementCollection
	private List<String> departments;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNoOfEmps() {
		return noOfEmps;
	}
	public void setNoOfEmps(String noOfEmps) {
		this.noOfEmps = noOfEmps;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrimaryTechnology() {
		return primaryTechnology;
	}
	public void setPrimaryTechnology(String primaryTechnology) {
		this.primaryTechnology = primaryTechnology;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	
	public void setDepartment(String department) {
		this.departments.add(department);
	}
	

}
