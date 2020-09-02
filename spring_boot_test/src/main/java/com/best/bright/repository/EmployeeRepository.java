package com.best.bright.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.best.bright.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
