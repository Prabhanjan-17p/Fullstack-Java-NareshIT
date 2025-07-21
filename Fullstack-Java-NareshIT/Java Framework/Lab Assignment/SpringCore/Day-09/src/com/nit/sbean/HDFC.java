package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component
public class HDFC implements Bank {

	private double amount;

	@Override
	public double getAmount() {
		return amount;
	}

	@Override
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String deposit(double amount) {
		this.amount += amount;
		return "Deposit Sccessfull (HDFC) updated balance is :: " + amount;
	}

	@Override
	public String withdraw(double amount) throws Exception {
		if (this.amount < amount) {
			throw new Exception("Incuficant Balance");
		} else {
			this.amount -= amount;
			return "Withdraw Sccessfull (HDFC) updated balance is :: " + amount;
		}

	}

}
