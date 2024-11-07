package com.ihub.www.controller;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihub.www.model.Employee;
import com.ihub.www.service.EmployeeService;
    
	@RestController
	@RequestMapping("/api/v1/")
	@CrossOrigin(origins="http://localhost:3001")
	public class EmployeeController 
	{
		@Autowired
		EmployeeService employeeService;
	
		@GetMapping("/employees")
		public List<Employee> getAllEmployees()
		{
			return employeeService.getAllEmployees();
		}
		
		@PostMapping("/employees")
		public Employee createEmployee(@RequestBody Employee employee)
		{
			return employeeService.createEmployee(employee);
		}
		
		
	}
	
