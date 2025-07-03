package com.nit.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("seasonP1")
public class SeasonFinder {
	private LocalDate date;
	
	public SeasonFinder() {
		System.out.println("SeasonFinder:: 0-parameter Constructor");
	}

	@Autowired
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String showSeason() {
		int day = date.getMonthValue();
		
		if (day >= 3 && day <= 6) return "Summer Season";
		else if (day >= 7 && day <= 9) return "Rainy Season";
		else return "Winter Season";
	}
}
