package com.nareshIT.day63;

public class RatingSystem extends Thread {
	@Override
	public void run() {
		System.out.println("Requesting user rating...");
		try {
			Thread.sleep(1000);
			System.out.println("User rated the ride: 5 star");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
