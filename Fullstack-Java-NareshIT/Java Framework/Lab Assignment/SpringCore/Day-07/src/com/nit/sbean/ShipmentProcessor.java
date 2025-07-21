package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShipmentProcessor {
	private Shipping ship;

	@Autowired
	public ShipmentProcessor(@Qualifier("dhl") Shipping ship) {
//	public ShipmentProcessor(@Qualifier("fed") Shipping ship) {
		super();
		this.ship = ship;
	}
	
	public void callDelivery(String name) {
		ship.shipPackage(name);
	}
	
}
