package com.nareshIT.day63;

public class OlaRidingApp {

	public static void main(String[] args) throws InterruptedException {
		Thread ride = new Thread(new RideRequest(),"RideRequestThread");
		Thread fare = new Thread(new FareCalculation(),"FareCalculationThread");
		Thread driver = new Thread(new DriverAssignment(),"DriverAssignmentThread");
		Thread liveTrack = new Thread(new LiveTracking(),"LiveTrackingThread");
		Thread pay = new Thread(new PaymentProcessing(),"PaymentProcessingThread");
		Thread rate = new Thread(new RatingSystem(),"RatingSystemThread");
		ride.start(); fare.start();
		driver.start();
		driver.join();
		liveTrack.start();
		liveTrack.join();
		pay.start();
		pay.join();
		rate.start();
	}

}
