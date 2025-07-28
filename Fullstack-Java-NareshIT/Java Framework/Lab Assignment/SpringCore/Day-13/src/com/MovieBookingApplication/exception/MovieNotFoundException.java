package com.MovieBookingApplication.exception;

public class MovieNotFoundException extends Exception {

	public MovieNotFoundException() {
		super("Movie that doesn't exist in the show list.");
	}
	
	public MovieNotFoundException(String name) {
		super(name);
	}
	
}
