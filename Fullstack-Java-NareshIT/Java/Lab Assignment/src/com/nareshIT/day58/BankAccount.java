package com.nareshIT.day58;

public class BankAccount  implements Bank,AutoCloseable{
	private  long accountNumber;
	 private double balance;
	 
	 public BankAccount(long accountNumber, double initialBalance) {
		    this.accountNumber = accountNumber;
		    this.balance = initialBalance;
		}
	 
	@Override
	public void deposite(double amount) throws InvalidAmountException {
		if(amount <= 0) {
			throw new InvalidAmountException("AMT must be grater than 0");
		}else {
			this.balance += amount; 
		}
	}
	@Override
	public void withdraw(double amount) throws InsufficientFundsException,InvalidAmountException{
		if (this.balance < amount) {
			throw new InsufficientFundsException("Insufficient Funds");
		}else if (amount <= 0) {
			throw new InvalidAmountException("AMT must be grater than 0");
		}else {
			this.balance -= amount;
		}
	}
	@Override
	public void transfer(BankAccount toAccount, double amount) 
	        throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {

	    if (toAccount == null) {
	        throw new AccountNotFoundException("Target account not found");
	    }

	    if (amount <= 0) {
	        throw new InvalidAmountException("Amount must be greater than 0");
	    }

	    if (this.balance < amount) {
	        throw new InsufficientFundsException("Insufficient funds in the account");
	    }

	    this.balance -= amount;
	    toAccount.balance += amount;

	    System.out.println("Successfully transferred ₹" + amount + " to Account ID: " + this.accountNumber);
	}

	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException,InvalidAmountException{
		if (this.balance < 50000) {
		    throw new LoanNotAllowedException("Balance must be at least 50000 to apply for a loan");
		}
		else if (amount <= 0) {
			throw new InvalidAmountException("AMT must be grater than 0");
		}else {
			System.out.println("Success");
		}
	}
	@Override
	public double getBalance() {
		return this.balance;
	}
	@Override
	public void close() throws Exception {
		throw new Exception("Closed");
	}
}
