package com.innoventes.assessment.repository;

import org.springframework.data.repository.CrudRepository;

import com.innoventes.assessment.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	

}
