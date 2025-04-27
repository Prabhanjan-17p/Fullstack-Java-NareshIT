package com.nareshIT.day50;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enrter a number : ");
		int num = sc.nextInt();
		System.out.println("Original value: "+num);
		if (num < 0) {
			System.err.println("Negative Number...");
			System.exit(0);
		}
		
		Function<Integer, Integer> adding = x -> {
			return x+5;
		};
		
		Function<Integer, Integer> multiplying = x -> {
			return x*2;
		};
		
		Function<Integer, Integer> subtracting = x -> {
			return x-3;
		};
		
		System.out.println("After adding 5: "+applyFunction(num, adding));
		System.out.println("After multiplying by 2: "+applyFunction(num, multiplying));
		System.out.println("After subtracting 3: "+applyFunction(num, subtracting));
		
	}
	public static int applyFunction(int value,  Function<Integer, Integer> fun) {
		return fun.apply(value);
	}

}
