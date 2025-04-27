package com.nareshIT.day38;

public class Customer {
	protected String name;

	public Customer(String name) {
		super();
		this.name = name;
		if (name == "") {
			System.err.println("Customer name cannot be empty.");
			System.exit(0);
		}
	}
	
	public void calculateBill(double... prices) {
		
	}
	
}
