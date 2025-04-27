package com.nareshIT.day37;

public class Calculator {
	public int add(int num1, int num2) {
		System.out.print("Sum of "+num1+" and "+num2+" (int):");
		return num1+num2;
	}
	public double add(double num1, double num2) {
		System.out.print("Sum of "+num1+" and "+num2+" (double):");
		return num1+num2;
	}
	public int multiply(int num1, int num2) {
		System.out.print("Product of "+num1+" and "+num2+" (int):");
		return num1*num2;
	}
	public double multiply(double num1, double num2) {
		System.out.print("Product of "+num1+" and "+num2+" (double):");
		return num1*num2;
	}
}
