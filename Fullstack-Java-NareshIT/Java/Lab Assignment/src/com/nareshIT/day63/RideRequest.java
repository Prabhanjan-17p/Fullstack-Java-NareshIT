package com.nareshIT.day63;

public class RideRequest extends Thread {
	@Override
	public void run() {
		System.out.println("User requested a ride...");
		try {
			Thread.sleep(2000);
			System.out.println("Searching for nearby drivers...");
			this.join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
