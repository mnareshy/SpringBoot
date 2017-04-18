package com.springboottest.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboottest.coe.COE;


@RestController
public class EmployeeController {
	
	
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/COES/{name}/Employees")
	public List<Employee> getEmployees(@PathVariable String name)
	{
		return employeeService.getEmpList(name);
	}
	
	@RequestMapping("/COES/{name}/Employees/{id}")
	public Employee getEmployee(@PathVariable String id)
	{
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/COES/{name}/Employees")
	public boolean addEmployee(@RequestBody Employee employee , @PathVariable String name){
		
		employee.setCoe(new COE(name,"","",""));
		return employeeService.addEmployee(employee);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/COES/{name}/Employees/{id}")
	public boolean updateEmployee(@RequestBody Employee employee, @PathVariable String name, @PathVariable String id){
		employee.setCoe(new COE(name,"","",""));
		return employeeService.updateEmployee(employee, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/COES/{name}/Employees/{id}")
	public boolean deleteEmployee(@PathVariable String id){
		
		return employeeService.deletEmployee(id);
	}

	
	
		

	

}
