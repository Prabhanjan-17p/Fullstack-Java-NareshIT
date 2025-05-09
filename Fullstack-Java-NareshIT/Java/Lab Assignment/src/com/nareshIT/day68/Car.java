package com.nareshIT.day68;

import java.util.Random;

public class Car implements Runnable {
    private ParkingGarage garage;
    private String carName;

    public Car(ParkingGarage garage, String carName) {
        this.garage = garage;
        this.carName = carName;
    }

    @Override
    public void run() {
        try {
            garage.parkCar(carName);
            
            Random rand = new Random();
            int stayTime = 1000 + rand.nextInt(4000); 
            Thread.sleep(stayTime);

            garage.freeSpot(carName);
        } catch (InterruptedException e) {
            System.out.println(carName + " thread was interrupted.");
        }
    }
}
