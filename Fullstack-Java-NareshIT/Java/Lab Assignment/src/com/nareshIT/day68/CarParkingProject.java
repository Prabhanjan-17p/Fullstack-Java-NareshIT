package com.nareshIT.day68;

public class CarParkingProject {

	public static void main(String[] args) {
		ParkingGarage pg = new ParkingGarage(5);
		Car [] cars= {new Car(pg, "Maruti Brezza"),new Car(pg,"Tata Naxon"),new Car(pg,"Mahindra BE6"),new Car(pg,"Kia Seltos"),
				new Car(pg,"Honda city"),new Car(pg,"Toyota Fortuner"),new Car(pg,"Hundai i20")};
		
		 System.out.println("Welcome to D-Mart Parking");
	     System.out.println("Total Available spots are :" + pg.getAvailableSpots());
		for(Car car : cars) {
			Thread t = new Thread(car);
			t.start();
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Parking garage simulation is complete.");
	}

}
