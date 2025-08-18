package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("ly")
public class LeapYearService {
	public String checkLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return "Leap Year";
		} else {
			return "Not a Leap Year";
		}
	}
}
