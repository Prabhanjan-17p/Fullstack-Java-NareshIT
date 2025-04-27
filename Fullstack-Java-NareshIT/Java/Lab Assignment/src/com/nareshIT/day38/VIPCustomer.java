package com.nareshIT.day38;

public class VIPCustomer extends Customer {
	protected double discountRate = 15.0;

	public VIPCustomer(String name) {
		super(name);
	}
	
	public void calculateBill(double... prices) {
		if (name == "") {
			System.err.println("Customer name cannot be empty.");
			System.exit(0);
		}
		System.out.println("_______Welcome to Hyderabad Mall_________");
		System.out.println("Customer: "+name);
		System.out.println("Total cost RS : "+prices[0]);
		double dis = prices[0]*(discountRate/100);
		System.out.println("Discount RS : "+dis);
		System.out.println("Final amount RS :"+(prices[0]-dis));
	}
}
