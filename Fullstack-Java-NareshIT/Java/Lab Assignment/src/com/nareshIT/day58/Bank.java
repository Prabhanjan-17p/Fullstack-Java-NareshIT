package com.nareshIT.day58;

public interface Bank {
	public void deposite(double amount) throws InvalidAmountException;
	void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;
	void transfer(BankAccount toAccount,double amount) throws InsufficientFundsException,AccountNotFoundException;
	void applyForLoan(double amount) throws LoanNotAllowedException,InvalidAmountException;
	double getBalance();
}
