package com.nareshIT.day54;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of rectangle: ");
		int len = sc.nextInt();
		System.out.print("Enter width of rectangle: ");
		int bre = sc.nextInt();
		calculateArea(len,bre);
	}
	public static double calculateArea(double x,double y) {
		double res =0;
		try {
			if (x < 0 || y < 0) {
				throw new IllegalArgumentException();
			}else {
				res = x*y;
				System.out.println("Area of rectangle with length "+x+" and width "+y+" is: "+res);
			}
		} catch (Exception e) {
			System.out.println("IllegalArgumentException caught: Dimensions must be positive: length="+x+", width="+y);
		}
		return res;
	}

}
