package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("card")
public class CardPaymentService  implements PaymentService{

	@Override
	public void processPayments(int amt) {
		System.out.println("-- Card Payment :: "+amt+" --");
	}

}
