package com.nareshIT.day40;

public class DebitCardPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("Processing Debit card payment");
	}
}
