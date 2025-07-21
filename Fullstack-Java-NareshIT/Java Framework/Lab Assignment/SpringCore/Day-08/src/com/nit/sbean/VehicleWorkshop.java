package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleWorkshop {
	private MaintenanceService mainS;

	@Autowired
	public VehicleWorkshop(@Qualifier("carService") MaintenanceService mainS) {
		super();
		this.mainS = mainS;
	}
	
	public void callService() {
		mainS.performService();
	}
}
