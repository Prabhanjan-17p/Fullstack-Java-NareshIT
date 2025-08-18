package com.nt.Strategy;

import org.springframework.stereotype.Component;

@Component("paypal")
public class PayPalPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal");
	}

}
