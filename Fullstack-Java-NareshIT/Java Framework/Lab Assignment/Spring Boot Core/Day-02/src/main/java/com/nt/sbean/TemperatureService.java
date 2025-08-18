package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("tm")
public class TemperatureService {
	public double convertToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
}
