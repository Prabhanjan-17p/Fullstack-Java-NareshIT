package com.nit.sbean;

public class Account {
	//HAS-A
	public Customer cust;
	
	int accountNo;
	double balance;
	float interestRate;
	
	public Account() {
		super();
	}

	public void deposit(double amount){
		this.balance = amount +balance;
	}
	
	public void withdraw(double amount){
		this.balance -= amount;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "Account [cust=" + cust + ", accountNo=" + accountNo + ", balance=" + balance + ", interestRate="
				+ interestRate + "]";
	}
	
}
