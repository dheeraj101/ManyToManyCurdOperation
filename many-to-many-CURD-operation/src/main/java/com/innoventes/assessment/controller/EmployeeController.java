package com.innoventes.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innoventes.assessment.entity.Employee;
import com.innoventes.assessment.service.EmployeeService;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping(value = "/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}
	
}
