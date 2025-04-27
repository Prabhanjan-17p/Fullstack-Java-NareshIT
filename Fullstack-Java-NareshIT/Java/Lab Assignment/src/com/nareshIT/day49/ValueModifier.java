package com.nareshIT.day49;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Name : ");
		String name = sc.nextLine();
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println("Original string: "+name);
		System.out.println("Original integer: "+num);
		Consumer<String> upper = (x)->{
			System.out.println("After converting string to uppercase: "+x.toUpperCase());
		};
		
		Consumer<Integer> sq = (x)->{
			System.out.println("After squaring the integer: "+x*x);
		};
		upper.accept(name);
		sq.accept(num);
		
	}

}
