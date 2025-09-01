package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("bike")
public class BikeService implements VehicleService {

	@Override
	public void performService() {
		System.out.println("🏍️ Bike service process runs");
	}

}
