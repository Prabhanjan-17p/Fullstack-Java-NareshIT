package com.nareshIT.day37;

public class Tester {

	public static void main(String[] args) {
		Employee e = new Employee(160, 15, 12000, 50000, 10);
		System.out.println(e.calculateSalary());
		System.out.println(e.calculateSalary(12000));
		System.out.println(e.calculateSalary(50000,10));
	}

}
