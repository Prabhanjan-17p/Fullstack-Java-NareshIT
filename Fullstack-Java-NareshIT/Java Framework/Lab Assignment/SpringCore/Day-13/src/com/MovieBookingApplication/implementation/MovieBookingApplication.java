package com.MovieBookingApplication.implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.MovieBookingApplication.exception.InvalidBookingException;
import com.MovieBookingApplication.exception.MovieNotFoundException;
import com.MovieBookingApplication.requirement.BookingService;


@Component
public class MovieBookingApplication {
	
	private BookingService bookingService;

	public MovieBookingApplication(BookingService bookingService) {
		super();
		this.bookingService = bookingService;
	}
	
	public void bookTicket(String movieName) throws MovieNotFoundException, InvalidBookingException {
        bookingService.bookTicket(movieName);
    }

    public void cancelTicket(String movieName) throws InvalidBookingException {
        bookingService.cancelTicket(movieName);
    }

    public void viewShows() {
        bookingService.viewShows();
    }
}
