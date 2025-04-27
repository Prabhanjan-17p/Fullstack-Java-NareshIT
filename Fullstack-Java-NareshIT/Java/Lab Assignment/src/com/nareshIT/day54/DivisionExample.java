package com.nareshIT.day54;

import java.util.Scanner;

public class DivisionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend :");
		int num1 =sc.nextInt();
		System.out.print("Enter divisor :");
		int num2 =sc.nextInt();
		try {
			System.out.println("Result of division: "+performDivision(num1,num2));
		} catch (Exception e) {
			System.out.println("ArithmeticException caught: Division by zero: dividend="+num1+", divisor="+num2);
		}
		
	}
	public static int performDivision(int x, int y) throws ArithmeticException
	{
		return x/y;
	}
}
