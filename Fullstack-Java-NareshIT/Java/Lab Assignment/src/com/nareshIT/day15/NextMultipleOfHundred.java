package com.nareshIT.day15;

public class NextMultipleOfHundred {
	public static int getNextMultipleOfHundred(int num){
		int last=((num/100)+1)*100;
		
		return last;
	}
}
