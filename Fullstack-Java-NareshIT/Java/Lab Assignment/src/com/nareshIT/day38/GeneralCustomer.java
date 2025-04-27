package com.nareshIT.day38;

public class GeneralCustomer extends Customer{

	public GeneralCustomer(String name) {
		super(name);
	}
	
	public void calculateBill(double... prices) {
		double total = 0;
	     for (double price : prices) 
	     {
	    	 if (price < 0) 
	         {
	             System.out.println("Item price cannot be negative.");
	             System.exit(0);
	         }
	         total += price;
	     }
		if (name == "") {
			System.err.println("Customer name cannot be empty.");
			System.exit(0);
		}
		System.out.println("_______Welcome to Hyderabad Mall_________");
		System.out.println("Customer: "+name);
//		System.out.println("Total cost RS : "+prices[0]);
		System.out.println("Total cost RS : "+total);
		System.out.println("Discount: No discount for regular customers.");
	}
}
