package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("homeloan")
public class HomeLoanCalculator implements InterestCalculator{

	@Override
	public double calculateInterest(double principal) {
		double rateOfInterest = 8.5;
		return (principal * rateOfInterest) / 100;
	}

}
