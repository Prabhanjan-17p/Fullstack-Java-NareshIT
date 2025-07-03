package com.nareshIT.day71;

public class EmployeeTester {
    public static void main(String[] args) {
        Manager miller = new Manager("Miller", 1, 15000, ManagerType.HR);
        Clerk jhon = new Clerk("Jhon", 2, 5000, 77, 85);

        System.out.println("Manager Salary: " + miller.getSalary()); 
        System.out.println("Clerk Salary: " + jhon.getSalary());    
    }
}

