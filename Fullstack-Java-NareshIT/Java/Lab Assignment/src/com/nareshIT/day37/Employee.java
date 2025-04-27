package com.nareshIT.day37;

public class Employee {
	private double hoursWorked;       
	private double hourlyRate;         
	private double annualSalary;	   
	private double salesAmount;
	private int commissionRate;
	
	public Employee(double hoursWorked, double hourlyRate) {
		super();
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public Employee(double annualSalary) {
		super();
		this.annualSalary = annualSalary;
	}

	public Employee(double salesAmount, int commissionRate) {
		super();
		this.salesAmount = salesAmount;
		this.commissionRate = commissionRate;
	}
	
	public Employee(double hoursWorked, double hourlyRate, double annualSalary, double salesAmount,
			int commissionRate) {
		super();
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		this.annualSalary = annualSalary;
		this.salesAmount = salesAmount;
		this.commissionRate = commissionRate;
	}

	public double calculateSalary(){
		System.out.print("Monthly salary of hourly employee: ");
		return hoursWorked*hourlyRate;
	}

	public double calculateSalary(double annualSalary){
		System.out.print("Monthly salary of salaried employee: ");
		return annualSalary/12.0;
	}
	
	public double calculateSalary(double salesAmount, double commissionRate){
		System.out.print("Commission of employee: ");
		return (salesAmount/commissionRate);
	}
	       
}
