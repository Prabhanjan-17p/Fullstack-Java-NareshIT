package com.nit.sbean;

public class StripeService  implements PaymentService {

	@Override
	public void process() {
		System.out.println("StripeService.process()");
	}
}
