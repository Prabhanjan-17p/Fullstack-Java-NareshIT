package com.nit.sbean;

public interface Bank {
	double getAmount();
	void setAmount(double amount);
	String deposit(double amount);
	String withdraw(double amount) throws Exception;
	String toString();
}
