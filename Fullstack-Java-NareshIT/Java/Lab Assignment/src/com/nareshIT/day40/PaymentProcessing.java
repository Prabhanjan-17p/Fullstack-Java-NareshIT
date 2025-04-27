package com.nareshIT.day40;

public class PaymentProcessing {
	
	public static void main(String[] args) {
		
		Payment p[] = new Payment[3];
		for(int i = 0;i <= p.length;i++) {
			if (i == 0) {
				p[i] = new CreditCardPayment();
			}else if (i == 1) {
				p[i] = new DebitCardPayment();
			}else if (i == 2) {
				p[i] = new UPI();
			}
		}
		
		paymentGateway(p);
	}
	
	public static void paymentGateway(Payment ...payments) {
		for(Payment p : payments) {
			p.processPayment();
		}
	}
}
