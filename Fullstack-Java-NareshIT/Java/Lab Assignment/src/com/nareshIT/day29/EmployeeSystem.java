package com.nareshIT.day29;

import java.util.*;

public class EmployeeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter permanent employee Id :");
		int empPID = sc.nextInt();
		System.out.print("Enter permanent employee Name :");
		String empPName = sc.nextLine();
		 empPName = sc.nextLine();
		System.out.print("Enter permanent employee Salary :");
		double empPSalary = sc.nextDouble();
		PermanentEmployee p = new PermanentEmployee(empPID, empPName, empPSalary);
		System.out.println(p);
		p.netSalary();
		
		System.out.print("Enter contract employee Id :");
		int empCID = sc.nextInt();
		System.out.print("Enter contract employee Name :");
		String empCName = sc.nextLine();
		 empCName = sc.nextLine();
		System.out.print("Enter contract employee Salary :");
		double empCSalary = sc.nextDouble();
		System.out.print("Enter contract duration in year :");
		int empCYear = sc.nextInt();
		ContractEmployee c = new ContractEmployee(empCID, empCName, empCSalary, empCYear);
		System.out.println(c);
		
		sc.close();

	}

}
