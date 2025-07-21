package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPaymentService implements PaymentService{

	@Override
	public void processPayments(int amt) {
		System.out.println("-- UPI Payment :: "+amt+" --");
	}

}
