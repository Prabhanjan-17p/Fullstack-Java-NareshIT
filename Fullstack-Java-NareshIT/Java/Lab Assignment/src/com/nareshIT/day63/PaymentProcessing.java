package com.nareshIT.day63;

public class PaymentProcessing extends Thread {
	@Override
	public void run() {
		System.out.println("Processing payment...");
		try {
			Thread.sleep(2000);
			System.out.println("Payment successful!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
