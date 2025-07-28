package com.MovieBookingApplication.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.MovieBookingApplication.exception.InvalidBookingException;
import com.MovieBookingApplication.exception.MovieNotFoundException;
import com.MovieBookingApplication.requirement.BookingService;

@Component("bookmy")
public class BookMyShowService implements BookingService {

	private static String cinemaName;
	private static String location;
	private static String partnerCode;

	private List<String> availableShows;

	private List<String> bookedTickets = new ArrayList<>();;

	public void setAvailableShows(List<String> availableShows) {
		this.availableShows = availableShows;
	}

	public void setBookedTickets(List<String> bookedTickets) {
		this.bookedTickets = bookedTickets;
	}

	public static void setCinemaName(String cinemaName) {
		BookMyShowService.cinemaName = cinemaName;
	}

	public static void setLocation(String location) {
		BookMyShowService.location = location;
	}

	public static void setPartnerCode(String partnerCode) {
		BookMyShowService.partnerCode = partnerCode;
	}

	@Override
	public void bookTicket(String movieName) throws MovieNotFoundException, InvalidBookingException {
		if (movieName == null || movieName.trim().isEmpty()) {
			throw new InvalidBookingException("Movie name cannot be null or empty.");
		}

		boolean movieFound = false;
		for (String mn : availableShows) {
			if (mn.equalsIgnoreCase(movieName)) {
				bookedTickets.add(movieName);
				movieFound = true;
				System.out.println("Ticket for '" + movieName + "' booked successfully!");
				break;
			}
		}

		if (!movieFound) {
			throw new MovieNotFoundException("Movie '" + movieName + "' not found in available shows.");
		}

	}

	@Override
	public void cancelTicket(String movieName) throws InvalidBookingException {
		if (movieName == null || movieName.trim().isEmpty()) {
			throw new InvalidBookingException("Movie name cannot be null or empty.");
		}

		boolean isCancelled = false;

		for (String booked : bookedTickets) {
			if (booked.equalsIgnoreCase(movieName)) {
				bookedTickets.remove(booked);
				isCancelled = true;
				System.out.println("Ticket for '" + movieName + "' cancelled successfully!");
				break;
			}
		}

		if (!isCancelled) {
			throw new InvalidBookingException("You haven't booked a ticket for '" + movieName + "'.");
		}
	}

	@Override
	public void viewShows() {
		availableShows.stream().forEach(x -> System.out.println(x));
	}

}
