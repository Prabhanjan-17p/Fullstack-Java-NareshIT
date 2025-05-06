package com.nareshIT.day63;


public class LiveTracking extends Thread {
	@Override
	public void run() {
		try {
			for(int i=2;i<=10;i+=2) {
				Thread.sleep(1000);
				System.out.println("Updating ride location... "+(i*10)+"% completed");
			}
			System.out.println("Ride completed!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
