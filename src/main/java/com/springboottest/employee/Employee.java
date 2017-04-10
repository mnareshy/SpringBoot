package com.springboottest.employee;

public class Employee {
	
	private String name;
	private String ID;
	
	public Employee(String name, String iD) {
		super();
		this.name = name;
		ID = iD;
	}
	
	public Employee() {
		super();
		
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	

}
