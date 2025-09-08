package com.nt.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.service.EmployeeIMPLService;


@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeIMPLService implService;

	@Override
	public void run(String... args) throws Exception {
//		Employee e1 = new Employee("Kanha", "Developer", 900000.0);
//		implService.saveEMP(e1);

//		List<Employee> employees = Arrays.asList(new Employee("Kanha", "Developer", 900000.0),
//				new Employee("Prabhanjan", "Software Engineer", 850000.0),
//				new Employee("Anita", "Team Lead", 1200000.0), new Employee("Rohit", "Tester", 600000.0),
//				new Employee("Sneha", "HR Manager", 750000.0), new Employee("Vikram", "Full Stack Developer", 950000.0),
//				new Employee("Pooja", "UI/UX Designer", 700000.0), new Employee("Amit", "Project Manager", 1400000.0),
//				new Employee("Neha", "Business Analyst", 800000.0),
//				new Employee("Suresh", "DevOps Engineer", 1000000.0));
//		String allEmp = implService.saveAllEmp(employees);
//		System.out.println(allEmp);
		
//		List<Employee> allEmp = implService.findAllEmp();
//		allEmp.stream().forEach(System.out::println);
		
		Employee byEMPId = implService.findByEMPId(5);
		System.out.println(byEMPId);
	}

}
