package com.nareshIT.day40;

public class CreditCardPayment extends Payment {
	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment");
	}
}
