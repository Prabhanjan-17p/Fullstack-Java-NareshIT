package com.nt.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {
	private final PaymentService paymentService;

	public PaymentProcessor(PaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}

	public void makePayment(double amount) {
		paymentService.processPayment(amount);
	}
}
