package com.MovieBookingApplication.exception;

public class InvalidBookingException extends Exception{

	public InvalidBookingException() {
		super("cancel a ticket that wasn't booked, or the movie name is invalid (null/empty).");
	}
	public InvalidBookingException(String name) {
		super(name);
	}

}
