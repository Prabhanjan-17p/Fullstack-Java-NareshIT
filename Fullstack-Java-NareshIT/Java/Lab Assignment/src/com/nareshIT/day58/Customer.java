package com.nareshIT.day58;

public class Customer {
	private String name;
	public BankAccount bankAccount;
	
	public Customer(BankAccount bankAccount,String name) {
		this.bankAccount = bankAccount;
		this.name = name;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}
}
