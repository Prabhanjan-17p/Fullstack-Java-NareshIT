package com.nareshIT.day58;

public class AccountNotFoundException extends RuntimeException{
	public AccountNotFoundException(String name) {
		super(name);
	}
}
