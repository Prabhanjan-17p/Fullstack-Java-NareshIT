package com.nt.Strategy;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
	}

}
