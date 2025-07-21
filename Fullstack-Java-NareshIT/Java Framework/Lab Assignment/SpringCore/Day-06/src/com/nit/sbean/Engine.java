package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    public void start(String fuelType, int temp, int pressure) {
        if (isFuelValid(fuelType) && checkTemp(temp) && tyrePressure(pressure)) {
            System.out.println("Car started successfully!");
            System.out.println("Engine started!!");
        } else {
            System.out.println("Engine failed to start!");
        }
    }

    public boolean isFuelValid(String fuelType) {
        return "petrol".equalsIgnoreCase(fuelType);
    }

    public boolean checkTemp(int temp) {
        return temp <= 30;
    }

    public boolean tyrePressure(int pressure) {
        return pressure >= 35 && pressure <= 40;
    }
}
