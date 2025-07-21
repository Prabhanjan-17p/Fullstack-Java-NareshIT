package com.nit.sbean;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("parkingLot")
public class ParkingLot {
	
    @Autowired
    private List<Car> cars; // Injects all Car beans: sedan, suv

    public void ParkingLot() {
        Random rand = new Random();
        int index = rand.nextInt(cars.size());
        Car selectedCar = cars.get(index);
        System.out.println(selectedCar.getCarType() + " car is parked in Slot A" + (index + 1));
    }
}
