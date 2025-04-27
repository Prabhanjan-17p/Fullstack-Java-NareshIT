package com.nareshIT.day12;

import java.util.Scanner;

public class Emp {
	
	int empNumber;
	String empName ;
	double empSalary;
	
	public void setEmpDetails() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Emp number : ");
		empNumber = sc.nextInt();
		System.out.println("Enter the Emp Name : ");
		empName = sc.nextLine();
		empName = sc.nextLine(); // due 1st int come 
		System.out.println("Enter the Emp salary : ");
		empSalary = sc.nextDouble();
	}
	
	
	public void getEmpDetails() {
		System.out.println("Emp number is : "+empNumber);
		System.out.println("Emp Name is: "+empName);
		System.out.println("Emp salary is: "+empSalary);
	}

}
