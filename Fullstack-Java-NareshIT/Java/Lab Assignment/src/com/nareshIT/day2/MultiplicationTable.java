package com.nareshIT.day2;

import java.util.Iterator;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 1) {
			System.out.println("Enter one number to find multiplication ");
			return;
		}
		int n1 = Integer.parseInt(args[0]);
		for (int i = 1; i <= 10; i++) {
			System.out.println(n1*i);
		}
	}

}
