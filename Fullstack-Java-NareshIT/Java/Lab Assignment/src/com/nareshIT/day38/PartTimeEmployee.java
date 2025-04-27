package com.nareshIT.day38;

public class PartTimeEmployee extends Employee {
	  protected double hourlyRate;
	  protected int hoursWorked;
	  
	  public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
		super(id, name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	  }
	  
	  public double calculateSalary() {
		if (hourlyRate <= 0) {
			System.err.println("Employee hourly rate can't be zero OR Negative");
			System.exit(0);
		}
		if (hoursWorked <= 0) {
				System.err.println("Employee hours of work can't be Negative");
				System.exit(0);
		 }
		return hourlyRate*hoursWorked;
	}
}
