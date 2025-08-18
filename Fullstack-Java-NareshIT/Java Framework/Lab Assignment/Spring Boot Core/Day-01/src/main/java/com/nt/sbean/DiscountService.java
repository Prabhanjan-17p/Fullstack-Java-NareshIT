package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("ds")
public class DiscountService {
	public double applyDiscount(double price, double discountPercentage) {
		return price*(discountPercentage/100.0);
	}
}
