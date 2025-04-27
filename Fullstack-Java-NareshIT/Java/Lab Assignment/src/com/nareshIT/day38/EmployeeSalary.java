package com.nareshIT.day38;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***Salary Calculation Menu***");
		System.out.println("1) FullTime Employees");
		System.out.println("2) PartTime Employees");
		System.out.println("Please select the Employee type");
		int typeEmp = sc.nextInt();
		sc.nextLine();
		if (typeEmp == 1) {
			System.out.print("Enter Fulltime Employee Id :");
			int Fid = sc.nextInt();
			System.out.print("Enter Fulltime Employee Name :");
			String Fname = sc.nextLine();
			Fname = sc.nextLine();
			System.out.print("Enter the Salary :");
			double Fsal = sc.nextDouble();
			Employee f = new FullTimeEmployee(Fid, Fname, Fsal);
			System.out.print(Fname+" Salary is :"+f.calculateSalary());
		}else {
			System.out.print("Enter PartTime Employee Id :");
			int Pid = sc.nextInt();
			System.out.print("Enter PartTime Employee Name :");
			String Pname = sc.nextLine();
			Pname = sc.nextLine();
			System.out.print("Enter your hourly rate:");
			double Phourly = sc.nextDouble();
			System.out.print("Enter your total works hour in the month :");
			int Pwim = sc.nextInt();
			Employee p = new PartTimeEmployee(Pid, Pname, Phourly,Pwim);
			System.out.print(Pname+" Salary is :"+p.calculateSalary());
		}
	}

}
