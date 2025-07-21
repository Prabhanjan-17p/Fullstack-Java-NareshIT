package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component
public class Rocket {
	
	public void ignite(String fuelType){
		if (isfuel(fuelType) == "full") {
			System.out.println("Rocket ignited"); 
		}else {
			System.out.println("Rocket not start");
		}
	}
	
	public String isfuel(String fuelType) {
		return fuelType;
	}
}
