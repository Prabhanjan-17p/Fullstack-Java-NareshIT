package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LoanProcessor {
	//HAS-A
	private InterestCalculator interestCalculator;

	//Constructor
	@Autowired
	public LoanProcessor(@Qualifier("homeloan") InterestCalculator interestCalculator) {
		super();
		this.interestCalculator = interestCalculator;
	}
	
	public void processLoan(double principal) {
		double calculateInterest = interestCalculator.calculateInterest(principal);
		System.out.println("Principle Amount :: "+principal);
		System.out.println("Total Payable Amount :: "+calculateInterest);
	}
}
