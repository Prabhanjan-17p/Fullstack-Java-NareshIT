package com.nareshIT.day29;

public class Employee {
	protected int employeeId;
	protected String employeeName;
	protected double employeeSalary;
	 
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		if (employeeId <= 0) {
			System.err.println("Invalid employeeID");
			System.exit(0);
		}
		if (employeeName == "") {
			System.err.println("Employee Name can't be null");
			System.exit(0);
		}
		if (employeeSalary <= 0) {
			System.err.println("Salary can't be 0 or negative");
		}
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	 
}
