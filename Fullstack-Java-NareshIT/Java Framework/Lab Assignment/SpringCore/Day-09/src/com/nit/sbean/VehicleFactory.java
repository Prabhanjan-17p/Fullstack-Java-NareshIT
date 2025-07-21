package com.nit.sbean;

public interface VehicleFactory {
	Vehicle createVehicle(String type, String engineType);
}
