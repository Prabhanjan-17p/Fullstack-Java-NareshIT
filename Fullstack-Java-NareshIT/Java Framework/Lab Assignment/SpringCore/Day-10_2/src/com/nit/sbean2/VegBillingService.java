package com.nit.sbean2;

import org.springframework.stereotype.Component;

@Component("veg")
public class VegBillingService implements BillingService{

	@Override
	public double getBill(String item) {
		double price;
		if (item.equalsIgnoreCase("Idli")) {
			price = 30;
		}else if (item.equalsIgnoreCase("Dosa")) {
			price = 50;
		}else {
			price = 0;
		}
		return price;
	}

}
