package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component
public class SBI implements Bank {

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
		return "Deposit Sccessfull (SBI) updated balance is :: " + amount;
	}

	@Override
	public String withdraw(double amount) throws Exception {
		if (this.amount < amount) {
			throw new Exception("Incuficant Balance");
		} else {
			this.amount -= amount;
			return "withdraw Sccessfull (SBI) updated balance is :: " + amount;
		}

	}

	@Override
	public String toString() {
		return "SBI [amount=" + amount + "]";
	}

}
