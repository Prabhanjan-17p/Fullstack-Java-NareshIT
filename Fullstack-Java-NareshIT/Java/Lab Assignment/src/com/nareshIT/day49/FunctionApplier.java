package com.nareshIT.day49;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String name = sc.nextLine();
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		
		Function<String, Integer> len = x -> x.length();
		
		Function<Integer, Double> div = x -> x/2.0;
		
		System.out.println("String length of "+name+": "+len.apply(name));
		System.out.println("Result of dividing "+num+" by 2: "+div.apply(num));
	}

}
