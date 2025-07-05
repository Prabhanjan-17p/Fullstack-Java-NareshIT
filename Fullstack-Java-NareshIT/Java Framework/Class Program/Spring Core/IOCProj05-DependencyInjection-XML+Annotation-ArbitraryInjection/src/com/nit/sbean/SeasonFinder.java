package com.nit.sbean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("seasonP1")
public class SeasonFinder {
	private LocalDate date;
	private LocalDateTime time;
	
	public SeasonFinder() {
		System.out.println("SeasonFinder:: 0-parameter Constructor");
	}

	//What ever we used function name and n- number of @Autowired used.
	@Autowired
	public void pushDate(LocalDate date) {
		this.date = date;
	}
	
	@Autowired
	public void addTime(LocalDateTime time) {
		this.time = time;
	}
	
	public String showSeason() {
		int day = date.getMonthValue();
		System.out.println("Date :: "+date+" <=> Time"+time);
		
		if (day >= 3 && day <= 6) return "Summer Season";
		else if (day >= 7 && day <= 9) return "Rainy Season";
		else return "Winter Season";
	}
}
