package com.nareshIT.day6;

public class Convert_Fahrenheit_To_Celsius {

//	public static void main(String[] args) {
//		if (args.length == 0) {
//			return;
//		}
//		int Fahrenheit = Integer.parseInt(args[0]);
//		
//		int cal =(Fahrenheit-32)*5/9;
//		
//		System.out.println("After convert : "+cal);
//	}
	
	public static void main(String[] args) {
		if (args.length == 0) {
			return;
		}
		int Celsius = Integer.parseInt(args[0]);
	
		int far =((9*Celsius)/5)+32;
	
		System.out.println("After convert : "+far);
	}

}
