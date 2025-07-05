package com.nit.sbean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("seasonP1")
public class SeasonFinder {
	private LocalDate date;
	private LocalDateTime time;
	
	@Autowired
	public SeasonFinder(LocalDate date, LocalDateTime time) {
		super();
		this.date = date;
		this.time = time;
	}
	
	/* // it will gives you error because only one Constructor will used @Autowired
	@Autowired
	public SeasonFinder(LocalDate date) {
		super();
		this.date = date;
		this.time = time;
	}
	*/ 
	


	public String showSeason() {
		int day = date.getMonthValue();
		System.out.println("Date :: "+date+" <=> Time"+time);
		
		if (day >= 3 && day <= 6) return "Summer Season";
		else if (day >= 7 && day <= 9) return "Rainy Season";
		else return "Winter Season";
	}
}
