package com.nareshIT.day15;

public class TwoDigitsDifference {
	public static int getDiffOfDigits(int num){
		int last=0;
		if (num >= 10 && num <= 99) {
			last = num%10;
			num /= 10;
		}else {
			System.err.println("Invalid Number");
			System.exit(0);
		}
		
		return num-last;
	}
}
