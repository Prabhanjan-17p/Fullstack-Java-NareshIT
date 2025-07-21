package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int customerId;
	private String customerName;
	private Bank bank;

	@Autowired
	private BankFactory bankFactory;
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName){
		this.customerName = customerName;
		//: Sets the customer name.
	}
	public void setBank(String bankType) throws Exception {
		// Sets the customer's bank using BankFactory
		this.bank = bankFactory.createBank(bankType);
	}

	public void deposit(double amount) {
		// Deposits money into the customer's bank account
		String message = bank.deposit(amount);
		System.out.println("Deposit Status: " + message);
	}

	public void withdraw(double amount) throws Exception {
		// Withdraws money from the customer's bank account
		String message = bank.withdraw(amount);
		System.out.println("Withdrawal Status: " + message);
	}

	public void displayDetails() {
		// Displays the customer's details including the bank account balance
		System.out.println("Customer ID   : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Bank Balance  : " + bank.toString());
	}
}
