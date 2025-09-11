package com.nt.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Component
public class EmployeeManagementApplication implements CommandLineRunner {

    @Autowired
    private IEmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("========== EMPLOYEE MANAGEMENT SYSTEM ==========");

        // 1. save() -> Insert single employee
        Employee e1 = new Employee("Kanha", "IT", 55000.0);
        Employee savedEmp = employeeRepository.save(e1);
        System.out.println("Saved Single Employee: " + savedEmp);

        // 2. saveAll() -> Insert multiple employees
        List<Employee> employees = Arrays.asList(
                new Employee("Ramesh", "HR", 45000.0),
                new Employee("Suresh", "Finance", 60000.0),
                new Employee("Mahesh", "Admin", 40000.0)
        );
        Iterable<Employee> savedAll = employeeRepository.saveAll(employees);
        System.out.println("Saved Multiple Employees: ");
        savedAll.forEach(System.out::println);

        // 3. findById() -> Fetch employee by ID
        Optional<Employee> empById = employeeRepository.findById(1L);
        System.out.println("Find By ID (1): " + empById.orElse(null));

        // 4. findAll() -> Retrieve all employees
        System.out.println("All Employees:");
        employeeRepository.findAll().forEach(System.out::println);

        // 5. existsById()
        boolean exists = employeeRepository.existsById(2L);
        System.out.println("Does Employee with ID 2 exist? " + exists);

        // 6. count()
        long count = employeeRepository.count();
        System.out.println("Total Employees: " + count);

        // 7. deleteById()
        employeeRepository.deleteById(3L);
        System.out.println("Deleted Employee with ID 3");

        // 8. delete(entity)
        Employee empToDelete = employeeRepository.findById(2L).orElse(null);
        if (empToDelete != null) {
            employeeRepository.delete(empToDelete);
            System.out.println("Deleted Employee: " + empToDelete);
        }

        // 9. deleteAll(Iterable)
        List<Employee> empList = (List<Employee>) employeeRepository.findAll();
        if (!empList.isEmpty()) {
            employeeRepository.deleteAll(empList.subList(0, 1));
            System.out.println("Deleted one employee using deleteAll(Iterable)");
        }

        // 10. deleteAll()
        employeeRepository.deleteAll();
        System.out.println("Deleted ALL employees");

        // Verify deletion
        System.out.println("All Employees After Deletion:");
        employeeRepository.findAll().forEach(System.out::println);

        System.out.println("========== END ==========");
    }
}
