package com.nareshIT.day59;

public class InvalidProductException extends RuntimeException{
	public InvalidProductException(String name) {
		super(name);
	}
}
