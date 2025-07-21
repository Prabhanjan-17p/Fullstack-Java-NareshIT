package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {
	private PaymentService pas;

//	@Autowired
//	public PaymentProcessor(@Qualifier("card") PaymentService pas) {
//		super();
//		this.pas = pas;
//	}

	@Autowired
	@Qualifier("upi")
	public void setPas(PaymentService pas) {
		this.pas = pas;
	}
	
	public void testAmount(int amt) {
		pas.processPayments(amt);
	}
	
	
}
