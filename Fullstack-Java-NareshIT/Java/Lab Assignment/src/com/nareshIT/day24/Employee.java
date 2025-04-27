package com.nareshIT.day24;

public class Employee {
	int id;
	String name ; 
	double basicSalary;
	double HRAPer ;
	double DAPer;
	
	
	
	public Employee(int id, String name, double basicSalary, double hRAPer, double dAPer) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
	}



	public double calculateGrossSalary() {
		return  basicSalary +HRAPer +DAPer;
	}
}
