package com.nt.service;

import org.springframework.stereotype.Service;

@Service("credit")
public class CreditCardDiscount implements DiscountService {

	@Override
	public double applyDiscount(double amount) {
		return amount * 0.9;
	}

}
