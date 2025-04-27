package com.nareshIT.day52;

import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		try {
			System.out.print("Enter 1st number :");
			int num1 = sc.nextInt();
			System.out.print("Enter 2nd number :");
			int num2 = sc.nextInt();
			
			System.out.print("You entered a = "+num1+" and b = "+num2);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage()); // due to detailMessage null it show null
			e.printStackTrace();
		}
	}
}
