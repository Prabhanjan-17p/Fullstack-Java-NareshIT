package com.nareshIT.day38;

import java.util.Iterator;
import java.util.Scanner;

public class ShoppingMall {
	
	public static void generateBill(Customer cust, double... prices) {
		cust.calculateBill(prices);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Customer Type to get additional Discount :");
		System.out.println("1) General Customer");
		System.out.println("2) Prime Customer");
		System.out.println("3) VIP Customer");
		System.out.print("Please enter Customer type :");
		int CustType = sc.nextInt();
		sc.nextLine();
		if (CustType >=1 && CustType <= 3) {}
		else {
			System.err.print("Pls enter a valid customer type!!!");
			System.exit(0);
		}
		
		System.out.print("Please Enter your Name :");
		String CustName = sc.nextLine();
		
		System.out.print("Enter number of Items :");
		int noI = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please Enter the Item Name and Price :");
		double price = 0.0;
		for(int i =1 ; i<= noI ; i++) {
			System.out.print(i+")Item Name");
			String Iname = sc.nextLine();
			System.out.print("Item Price :");
			double Iprice = sc.nextDouble();
			sc.nextLine();
			if (Iprice < 0) {
					System.out.println("_______Welcome to Hyderabad Mall_________");
	                System.err.println("Item price cannot be negative.");
	                return;
	        }
			price+=Iprice;
		}
		
		Customer cs = null;
		
		switch (CustType) {
		case 1: 
			cs = new GeneralCustomer(CustName);
			break;
		case 2: 
			cs = new PrimeCustomer(CustName);
			break;
		case 3: 
			cs = new VIPCustomer(CustName);
			break;
		default:
			System.err.println("Enter a valid customer type!!!");
		}
		
		generateBill(cs, price);
		
	}

}
