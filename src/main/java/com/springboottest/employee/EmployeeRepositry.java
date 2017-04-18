package com.springboottest.employee;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepositry extends CrudRepository<Employee, String> {
	
	public List<Employee> findByCoeName(String name);

}
