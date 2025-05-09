package com.nareshIT.day68;

public class ParkingGarage {
	int availableSpots=5;
	final int MAX_SPOTS ;

	public ParkingGarage(int mAX_SPOTS) {
		super();
		MAX_SPOTS = mAX_SPOTS;
		this.availableSpots = MAX_SPOTS;
	}

	public synchronized void parkCar(String carName) throws InterruptedException {
        while (availableSpots == 0) {
            System.out.println(carName + " is waiting for a spot.");
            wait();
        }

        availableSpots--;
        System.out.println(carName + " parked. Available spots: " + availableSpots);
    }
	  public synchronized void freeSpot(String carName) {
	        availableSpots++;
	        System.out.println(carName + " left. Available spots: " + availableSpots);
	        notifyAll();
	    }
	public int getAvailableSpots() {
		return this.availableSpots;
	}
}
