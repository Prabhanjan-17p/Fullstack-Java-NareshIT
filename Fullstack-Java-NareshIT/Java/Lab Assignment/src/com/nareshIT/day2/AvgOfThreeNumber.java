package com.nareshIT.day2;

public class AvgOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 3) {
			System.out.println("Enter Three number to find the avg of these number ");
			return;
		}
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		int avg = (n1+n2+n3)/3;
		System.out.println("Avg is "+avg);
	}

}
