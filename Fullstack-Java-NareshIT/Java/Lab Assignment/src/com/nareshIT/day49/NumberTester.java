package com.nareshIT.day49;

import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;

public class NumberTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		Predicate<Integer> test = x ->{
			int ch = (int)x;
			return testPredicate(ch,1);
		};
		System.out.println("Is "+num+" even? "+test.test(num));
		
		//For Prime check
		Predicate<Integer> test1 = x ->{
			int ch = (int)x;
			return testPredicate(ch,2);
		};
		System.out.println("Is "+num+" prime? "+test1.test(num));
		
	}
	public static boolean testPredicate(int num,int checkPE) {
		
		if (checkPE == 1) {
			if (num % 2 == 0 ) {
				return true;
			}
		}else {
			boolean isPrime = true;
			
			for(int i=2 ; i< num;i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				return true;
			}else {
				return false;
			}
		}
		
	
		return false;
	}

}
