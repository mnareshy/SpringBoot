package com.springboottest.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping("/emplist")
	public List<Employee> getEmployees()
	{
		return Arrays.asList(
				new Employee("1212", "SAIRAM"),
				new Employee("1234", "SAIRAM1"),
				new Employee("1442", "SAIRAM2"),
				new Employee("1332", "Naresh M")
				
							);
		
	}

}
