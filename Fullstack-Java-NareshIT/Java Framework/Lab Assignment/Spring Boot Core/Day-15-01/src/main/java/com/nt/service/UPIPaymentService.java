package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("UPI")
public class UPIPaymentService implements PaymentService {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing payment of $" + amount + " via UPI.");
	}

}
