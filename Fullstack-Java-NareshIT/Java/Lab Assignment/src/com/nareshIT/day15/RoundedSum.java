package com.nareshIT.day15;

public class RoundedSum {
	public static int  sumOfRoundedValues(int num1,int num2,int num3) {
//		int lastN1,lastN2,lastN3;
//        lastN1 = num1%10;
//        lastN2 = num2%10;
//        lastN3 = num3%10;
//
//        int nextMul1 = ((num1/10)+1)*10;
//        int nextPev1 = ((num1/10))*10;
//        int nextMul2 = ((num2/10)+1)*10;
//        int nextPev2 = ((num2/10))*10;
//        int nextMul3 = ((num3/10)+1)*10;
//        int nextPev3 = ((num3/10))*10;

//        return ((lastN1 >= 5)?nextMul1:nextPev1)+
//                ((lastN2 >= 5)?nextMul2:nextPev2)+
//                ((lastN3 >= 5)?nextMul3:nextPev3);
		
		int r1 = ((num1/10) + (num1 % 10 /5)) * 10; 
		int r2 = ((num2/10) + (num2 % 10 /5)) * 10; 
		int r3 = ((num3/10) + (num3 % 10 /5)) * 10; 
		
		return r1+r2+r3;
	}
}
