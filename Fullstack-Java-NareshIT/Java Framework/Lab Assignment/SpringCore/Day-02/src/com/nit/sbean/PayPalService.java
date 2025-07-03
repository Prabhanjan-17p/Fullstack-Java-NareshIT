package com.nit.sbean;

public class PayPalService implements PaymentService {

	@Override
	public void process() {
		System.out.println("PayPalService.process()");
	}
}
