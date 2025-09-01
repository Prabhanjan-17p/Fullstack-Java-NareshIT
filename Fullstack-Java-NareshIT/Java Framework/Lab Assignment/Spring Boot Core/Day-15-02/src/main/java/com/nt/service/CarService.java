package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("car")
public class CarService implements VehicleService {

	@Override
	public void performService() {
		System.out.println("🚗 Car service process runs");
	}

}
