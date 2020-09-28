package com.innoventes.assessment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.innoventes.assessment.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	

}
