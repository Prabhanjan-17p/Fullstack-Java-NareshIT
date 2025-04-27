package com.nareshIT.day35;

import java.util.Scanner;

public class PaymentProcess {

	public static void main(String[] args) {
		System.out.println("Payment Menu");
		System.out.println("Please select any one Payment Method from the Menu :");
		System.out.println("\t\t 1) Payment by using Cash ");
		System.out.println("\t\t 2) Payment by using Credit Card ");
		System.out.println("\t\t 3) Payment by using Debit Card ");
		Payment p = new Payment();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Payment choice [1/2/3]");
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			System.out.println("Enter your Payment Amount :");
			double amt = sc.nextDouble();
			p.makePayment(amt);
			break;
		}
		case 2: {
			System.out.println(" Enter your name :");
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.println("Enter your 16 digit Debit Card Number :");
			String cardNum = sc.nextLine();
			System.out.println("Enter your Payment Amount :");
			double amt = sc.nextDouble();
			p.makePayment(name, cardNum, amt);
			break;
		}
		case 3: {
			System.out.println("Enter your 16 digit Debit Card Number :");
			String cardNum = sc.nextLine();
			cardNum = sc.nextLine();
			System.out.println("Enter your Payment Amount :");
			double amt = sc.nextDouble();
			p.makePayment(cardNum, amt);
			break;
		}
		default:
			System.err.println("Please enter a valid choice...");
		}
		sc.close();
	}

}
