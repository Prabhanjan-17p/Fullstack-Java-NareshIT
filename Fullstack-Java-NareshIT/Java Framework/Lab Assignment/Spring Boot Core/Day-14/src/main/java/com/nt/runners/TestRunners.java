package com.nt.runners;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Employees;
import com.nt.repository.EmployeeRepository;

@Component
public class TestRunners implements CommandLineRunner{
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
//		// Clear old data
//        repo.deleteAll();
//
//        // Insert sample data
//        repo.saveAll(List.of(
//                new Employees(null, "Prabhanjan Amanta", "IT", 60000, LocalDate.of(2022, 5, 10)),
//                new Employees(null, "Rohit Sharma", "HR", 45000, LocalDate.of(2023, 3, 15)),
//                new Employees(null, "Sneha Patnaik", "Finance", 70000, LocalDate.of(2021, 8, 25)),
//                new Employees(null, "Anil Kumar", "IT", 52000, LocalDate.of(2024, 1, 12)),
//                new Employees(null, "Priya Singh", "Marketing", 48000, LocalDate.of(2023, 10, 5))
//        ));

        // 1. Find employees by department
        System.out.println("\nEmployees in IT Department:");
        repo.findByDepartment("IT").forEach(System.out::println);

        // 2. Find employees with salary greater than 50000
        System.out.println("\nEmployees with salary > 50000:");
        repo.findBySalaryGreaterThan(50000).forEach(System.out::println);

        // 3. Find employees joined after 2023-01-01
        System.out.println("\nEmployees joined after 2021-12-01:");
        repo.findByJoiningDateAfter(LocalDate.of(2021,12,01)).forEach(System.out::println);

        // 4. Find employees by name containing keyword
        System.out.println("\nEmployees name contains 'an':");
        repo.findByNameContainingIgnoreCase("an").forEach(System.out::println);
	}

}
