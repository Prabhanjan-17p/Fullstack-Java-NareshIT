package com.nareshIT.day13;

import java.util.Scanner;

public class Emp {
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int noOfProject;
	int ext;
	
	public void setEmpDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		firstName = sc.next();
		System.out.println("Enter last name: ");
		lastName = sc.next();
		System.out.println("Enter emp id: ");
		employeeId = sc.nextInt();
		System.out.println("Enter salary: ");
		salary = sc.nextDouble();
		System.out.println("Enter no Of Project: ");
		noOfProject = sc.nextInt();
		ext = calExtraSal(noOfProject);
		salary = salary+ext;
	}
	
	public int calExtraSal(int nop) {
		if (nop > 5 && nop < 10) {
			return 5000;
		}
		else if(nop > 10 && nop < 20) {
			return 10000;
		}
		else if (nop > 20) {
			return 15000;
		}
		return 0;
	}
	
	public void displayDetails() {
		System.out.println("Emp first name "+firstName + " last name: "+ lastName+" emp id "+employeeId
				+" no of project "+noOfProject+" salary is :"+salary);
	}
}
