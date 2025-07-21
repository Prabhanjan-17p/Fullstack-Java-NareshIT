package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component
public class ConcreteVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle createVehicle(String type, String engineType) {
		// Choose engine type
		Engine engine;
		if (engineType.equalsIgnoreCase("Electric")) {
			engine = new ElectricEngine();
		} else if (engineType.equalsIgnoreCase("Diesel")) {
			engine = new DieselEngine();
		} else {
			throw new IllegalArgumentException("Unsupported engine type: " + engineType);
		}

		switch (type.toLowerCase()) {
		case "car":
			return new Car(4,engine.getEngineType()); // default 4 doors
		case "truck":
			return new Truck(1000,engine.getEngineType()); // default payload 1000kg
		case "motorcycle":
			return new Motorcycle(engine.getEngineType(), false); // default no sidecar
		default:
			throw new IllegalArgumentException("Unsupported vehicle type: " + type);
		}
	}

}
