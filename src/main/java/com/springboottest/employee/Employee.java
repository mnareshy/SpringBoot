package com.springboottest.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.springboottest.coe.COE;


@Entity
public class Employee {

	public Employee(String id, String name, String primaryTechnology, String coeName) {
		super();
		id = this.id;
		this.name = name;
		this.primaryTechnology = primaryTechnology;
		this.coe = new COE(coeName,"","", "");
		
	}


	public Employee() {
		super();

	}

	@Id
	private String id;
	private String name;
	private String primaryTechnology;

	@ManyToOne
	private COE coe;

	public String getID() {
		return id;
	}

	public void setID(String iD) {
		id = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrimaryTechnology() {
		return primaryTechnology;
	}

	public void setPrimaryTechnology(String primaryTechnology) {
		this.primaryTechnology = primaryTechnology;
	}

	public COE getCoe() {
		return coe;
	}

	public void setCoe(COE coe) {
		this.coe = coe;
	}





}
