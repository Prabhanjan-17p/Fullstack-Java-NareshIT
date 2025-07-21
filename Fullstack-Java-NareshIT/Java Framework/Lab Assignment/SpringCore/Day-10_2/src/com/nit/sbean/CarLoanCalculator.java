package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("carloan")
public class CarLoanCalculator implements InterestCalculator{

	@Override
	public double calculateInterest(double principal) {
		double rateOfInterest = 10.5;
		return (principal * rateOfInterest) / 100;
	}

}
