package com.nareshIT.day63;

public class DriverAssignment extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Driver found and assigned!");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
