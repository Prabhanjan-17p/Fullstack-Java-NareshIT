package com.nareshIT.day50;

import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLogic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enrter a number : ");
		int num = sc.nextInt();
		
        Predicate<Integer> isEven = num1 -> num1 % 2 == 0;

        Predicate<Integer> isGreaterThanTen = num1 -> num1 > 10;

        Predicate<Integer> isPrime = num1 -> {
            if (num1 <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num1); i++) {
                if (num1 % i == 0) return false;
            }
            return true;
        };

        System.out.println(num + " is even: " + testPredicate(num, isEven));
        System.out.println(num + " is greater than 10: " + testPredicate(num, isGreaterThanTen));
        System.out.println(num + " is prime: " + testPredicate(num, isPrime));
	}
	public static boolean testPredicate(int x, Predicate<Integer> t) {
		return t.test(x);
	}
}
