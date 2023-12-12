package com.nagarro.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}