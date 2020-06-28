package com.sgundla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgundla.model.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByEmail(String email);
}