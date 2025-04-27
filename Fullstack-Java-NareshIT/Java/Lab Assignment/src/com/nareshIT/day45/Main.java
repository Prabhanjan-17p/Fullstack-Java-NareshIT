package com.nareshIT.day45;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Product Type:\r\n"+ "1. Digital Product\r\n"+ "2. Physical Product");
		int choice = sc.nextInt();
		Product p = null;
		switch (choice) {
		case 1: {
			System.out.println("Enter Digital Product Name :");
			String pn = sc.nextLine();
			pn = sc.nextLine();
			
			System.out.println("Enter Product Price :");
			int pp = sc.nextInt();
			
			System.out.println("Enter Product Category :");
			String pc = sc.nextLine();
			pc = sc.nextLine();
			
			System.out.println("Enter Product License Key :");
			String pl = sc.nextLine();
			
			p = new DigitalProduct(pn, pp, pc, pl);
			p.applyDiscount(10);
			p.calculateTax();
			System.out.println(p);
			break;
		}
		case 2: {
			System.out.println("Enter Digital Product Name :");
			String pn1 = sc.nextLine();
			pn1 = sc.nextLine();
			
			System.out.println("Enter Product Price :");
			int pp1 = sc.nextInt();
			
			System.out.println("Enter Product Category :");
			String pc1 = sc.nextLine();
			pc1 = sc.nextLine();
			
			System.out.println("Enter Product weight :");
			double pw = sc.nextDouble();
			
			p = new PhysicalProduct(pn1, pp1, pc1, pw);
			p.applyDiscount(15);
			p.calculateTax();
			System.out.println(p);
			break;
		}
		default:
			System.err.println("Invalid choice.....");
		}

	}
}
