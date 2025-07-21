package com.nit.sbean2;

import org.springframework.stereotype.Component;

@Component("nonveg")
public class NonVegBillingService implements BillingService{

	@Override
	public double getBill(String item) {
		double price;
		if (item.equalsIgnoreCase("Chicken Biryani")) {
			price = 150;
		}else if (item.equalsIgnoreCase("Mutton Curry")) {
			price = 200;
		}else {
			price = 0;
		}
		return price;
	}

}
