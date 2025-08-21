package com.nt.service;

import org.springframework.stereotype.Service;

@Service("newyear")
public class NewYearDiscount implements DiscountService {

	@Override
	public double applyDiscount(double amount) {
		return amount * 0.8;
	}

}
