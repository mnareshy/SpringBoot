package com.springboottest.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	

	@Autowired
	private EmployeeRepositry employeeRepositry;

	public List getEmpList(String coeName)
	{
		List empList = new ArrayList<Employee>();

		employeeRepositry.findByCoeName(coeName).forEach(empList::add);

		return empList;

	}


	public Employee getEmployee(String id){



		return employeeRepositry.findOne(id);

	}


	public boolean addEmployee(Employee employee) {


		employeeRepositry.save(employee);

		return true;
	}


	public boolean updateEmployee(Employee employee, String id) {

		employeeRepositry.save(employee);

		return true;

	}


	public boolean deletEmployee(String id) {


		employeeRepositry.delete(id);

		return true;
	}

}
