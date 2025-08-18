package com.nt.Service;


import org.springframework.stereotype.Service;

import com.nt.Strategy.PaymentStrategy;

@Service
public class PaymentService {
	
	private PaymentStrategy paymentStrategy;

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void makePayment(double amount) {
		if (paymentStrategy == null) {
			System.out.println("Payment method not set!");
		} else {
			paymentStrategy.pay(amount);
		}
	}
}
