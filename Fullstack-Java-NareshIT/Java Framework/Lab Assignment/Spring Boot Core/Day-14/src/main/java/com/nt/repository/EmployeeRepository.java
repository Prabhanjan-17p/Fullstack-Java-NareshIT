package com.nt.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.model.Employees;

public interface EmployeeRepository extends MongoRepository<Employees, String>{
	// 1. Find employees by department
    List<Employees> findByDepartment(String department);

    // 2. Find employees with salary greater than a given amount
    List<Employees> findBySalaryGreaterThan(double salary);

    // 3. Find employees joined after a given date
    List<Employees> findByJoiningDateAfter(LocalDate date);

    // 4. Find employees by name containing a keyword (case-insensitive)
    List<Employees> findByNameContainingIgnoreCase(String keyword);
}
