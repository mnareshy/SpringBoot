package com.springboottest.coe;


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
	
	
	private String name;
	private String noOfEmps;
	private String description;
	private String primaryTechnology;
	
	
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
	

}
