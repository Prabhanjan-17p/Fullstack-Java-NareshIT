package com.nt.service;

import org.springframework.stereotype.Service;

@Service("nodiscount")
public class NoDiscountService implements DiscountService {

	@Override
	public double applyDiscount(double amount) {
		return amount;
	}

}
