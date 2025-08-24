package com.nt.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component("flight")
@Getter
@Setter
@ToString
public class Flight {
	@Value("${flight.number}")
    private String flightNumber;

    @Value("${flight.departure}")
    private String departureCity;

    @Value("${flight.destination}")
    private String destinationCity;

    @Value("${flight.price}")
    private double ticketPrice;
}
