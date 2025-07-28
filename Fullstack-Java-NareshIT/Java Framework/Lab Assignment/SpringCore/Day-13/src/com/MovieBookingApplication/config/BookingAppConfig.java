package com.MovieBookingApplication.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.MovieBookingApplication.beans.BookMyShowService;
import com.MovieBookingApplication.beans.InoxService;
import com.MovieBookingApplication.implementation.MovieBookingApplication;
import com.MovieBookingApplication.requirement.BookingService;

@Configuration
public class BookingAppConfig {
	  @Bean
	    public BookingService bookMyShowService() {
	        BookMyShowService service = new BookMyShowService();
	        service.setCinemaName("BookMyShow");
	        service.setLocation("Mumbai");
	        service.setPartnerCode("BMS123");
	        service.setAvailableShows(
	            Arrays.asList("Inception", "The Dark Knight", "Interstellar", "Titanic", "Avatar")
	        );
	        return service;
	    }

	    @Bean
	    public BookingService inoxService() {
	        InoxService service = new InoxService();
	        service.setCinemaName("INOX");
	        service.setLocation("Delhi");
	        service.setPartnerCode("INOX456");
	        service.setAvailableShows(
	            Arrays.asList("Joker", "Avengers: Endgame", "Shazam", "Black Panther", "Oppenheimer")
	        );
	        return service;
	    }

	    @Bean
	    public MovieBookingApplication movieBookingApplication(@Qualifier("bookMyShowService") BookingService service) {
	        return new MovieBookingApplication(service);
	    }
	
}

