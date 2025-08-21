package com.nt.service;

import org.springframework.stereotype.Service;

@Service("coupon")
public class CouponDiscount implements DiscountService {

	@Override
	public double applyDiscount(double amount) {
		return amount - 100;
	}

}
