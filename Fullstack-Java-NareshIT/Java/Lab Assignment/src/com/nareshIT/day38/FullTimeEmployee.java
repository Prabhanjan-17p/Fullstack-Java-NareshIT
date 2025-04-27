package com.nareshIT.day38;

public class FullTimeEmployee extends Employee{
	  protected double salary;

	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}
	
	public double  calculateSalary() {
		if (salary <= 0) {
			System.err.println("Salary can't be negative!!!");
			System.exit(0);
		}
		return salary;
	}
}
