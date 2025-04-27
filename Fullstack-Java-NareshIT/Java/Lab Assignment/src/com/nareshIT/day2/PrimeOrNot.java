package com.nareshIT.day2;

public class PrimeOrNot {
	public static void main(String[] args) {
		 if (args.length < 1) {
	            System.out.println("Enter a number to check if it is prime or not.");
	            return;
	        }

	        int n1 = Integer.parseInt(args[0]);

	        if (n1 <= 1) {
	            System.out.println("Error: Enter a positive integer greater than 1.");
	            return;
	        }

	        boolean isPrime = true;

	        for (int i = 2; i <= n1 / 2; i++) {  
	            if (n1 % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }

	        if (isPrime) {
	            System.out.println(n1 + " is a Prime Number.");
	        } else {
	            System.out.println(n1 + " is Not a Prime Number.");
	        }
		
	}
}
