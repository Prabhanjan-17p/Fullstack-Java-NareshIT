package com.nareshIT.day7;

public class SumOfTwoDigit {

	public static void main(String[] args) {
		
		int num = 13;
		if (num < 0) {
			System.out.println("-3");
		}
		else if (num >= 0 && num <= 9) {
			System.out.println("-1");
		}
		else if (num >= 100) {
			System.out.println("-2");
		}
		else {
			int temp = num ;
			int last = temp % 10;
			temp = temp / 10;
			int sum = last+temp;
			System.out.println("Sum = "+sum);
		}

	}

}
