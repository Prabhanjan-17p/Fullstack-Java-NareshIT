package com.nt.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceCenter {
	
	private final VehicleService vehicleService;

	public ServiceCenter(VehicleService vehicleService) {
		super();
		this.vehicleService = vehicleService;
	}
	
	public void performService() {
		vehicleService.performService();
	}
}
