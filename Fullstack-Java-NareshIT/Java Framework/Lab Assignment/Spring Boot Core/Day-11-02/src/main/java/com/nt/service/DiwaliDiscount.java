package com.nt.service;

import org.springframework.stereotype.Service;

@Service("diwali")
public class DiwaliDiscount implements DiscountService {

	@Override
	public double applyDiscount(double amount) {
		return amount * 0.7;
	}

}
