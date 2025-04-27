package com.nareshIT.day15;

import java.util.Scanner;

public class NextMultipleOfHundredDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the next multiple");
		int tem= sc.nextInt();
		int num = NextMultipleOfHundred.getNextMultipleOfHundred(tem);
		System.out.println(num);
	}

}
