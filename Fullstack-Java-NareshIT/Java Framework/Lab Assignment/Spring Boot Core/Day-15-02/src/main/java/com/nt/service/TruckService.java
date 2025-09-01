package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("truck")
public class TruckService implements VehicleService {

	@Override
	public void performService() {
		System.out.println("🚛 Truck service process runs");
	}

}
