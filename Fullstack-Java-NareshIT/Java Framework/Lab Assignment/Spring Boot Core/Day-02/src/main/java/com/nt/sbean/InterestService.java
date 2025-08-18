package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("is")
public class InterestService {
	public double calculateSimpleInterest(double principal, double rate, double time) {
		return (principal * rate * time) / 100;
	}
}
