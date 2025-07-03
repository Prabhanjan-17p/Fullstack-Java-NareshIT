package com.nit.sbean;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("weekdayendP1")
public class WeekEndDay_Assignment {
	private LocalDate date;

	@Autowired
	public void setDate(LocalDate date) {
		System.out.println("WeekEndDay_Assignment Using Setter Injection");
		this.date = date;
	}

	public WeekEndDay_Assignment() {
		super();
		System.out.println("WeekEndDay_Assignment :: 0-parameter Constructor");
	}
	
	public String showWeekDayEnd() {
		DayOfWeek day = date.getDayOfWeek();
		
		switch (day) {
        case SATURDAY:
        case SUNDAY:
            return day + " is a Weekend";
        default:
            return day + " is a Weekday";
    }
	}
	
	
}
