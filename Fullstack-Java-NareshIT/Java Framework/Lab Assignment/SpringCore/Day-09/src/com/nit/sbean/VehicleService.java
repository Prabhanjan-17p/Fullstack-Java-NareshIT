package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

	@Autowired
    private VehicleFactory vehicleFactory;

    public String createVehicle(String type, String engineType) {
        Vehicle vehicle = vehicleFactory.createVehicle(type, engineType);
        return vehicle.getDescription();
    }
}
