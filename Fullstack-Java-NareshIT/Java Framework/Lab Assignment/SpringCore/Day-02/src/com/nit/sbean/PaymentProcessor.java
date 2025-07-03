package com.nit.sbean;

public class PaymentProcessor {
	private PaymentService payment;

	public PaymentProcessor(PaymentService payment) {
		super();
		this.payment = payment;
		System.out.println("PaymentProcessor. 1 :: parameter Consrtuctor");
	}
	
	public void makePay() {
		payment.process();
	}
}
