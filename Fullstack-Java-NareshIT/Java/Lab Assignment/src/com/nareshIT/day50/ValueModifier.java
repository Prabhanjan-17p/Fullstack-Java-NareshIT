package com.nareshIT.day50;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enrter a number : ");
		int num = sc.nextInt();
		System.out.println("Original value: "+num);
		
		Consumer<Integer> doubling = x ->{
			System.out.println("After doubling the value: "+(x+x));
		};
		
		Consumer<Integer> incrementing = x ->{
			System.out.println("After incrementing the value by 3: "+(x+3));
		};
		
		Consumer<Integer> squaring = x ->{
			System.out.println("After squaring the value: "+(x*x));
		};
		
		testPredicate(num , doubling);
		testPredicate(num , incrementing);
		testPredicate(num , squaring);
	}
	public static void testPredicate(int value, Consumer<Integer> con) {
		con.accept(value);
	}
}
