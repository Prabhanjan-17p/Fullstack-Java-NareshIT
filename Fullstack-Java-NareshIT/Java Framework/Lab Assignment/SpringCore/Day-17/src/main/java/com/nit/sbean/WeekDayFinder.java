package com.nit.sbean;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wf")
public class WeekDayFinder {
	//field injection
	
	
	@Qualifier("ldate")
	@Autowired
	private LocalDate date;
	
	//constructor injection
	@Autowired
	public WeekDayFinder(@Qualifier("ldate1")LocalDate date) {
		this.date=date;
	}
	//arbitary method
	
	@Qualifier("ldate3")
	@Autowired
	public void putDate(LocalDate date) {
		System.out.println("weekDayFinder.putDate()");
		this.date=date;
	}
	//setter method
	
	@Qualifier("ldate2")
	@Autowired
	public void setDate(LocalDate date) {
		System.out.println("WeekDayFinder.setDate()");
		this.date=date;
	}
	public WeekDayFinder() {
		System.out.println("WeekDayFinder::0-param constructor");
	}
	public String showGreetMessage(String name) {
		System.out.println("WeekDayFinder.showGreetMessage()::"+date);
		int day=date.getDayOfWeek().getValue();
		if(day!=6 && day!=7)return "Happy Work Day!"+name;
		else return "Happy Holiday"+name;
	}
	
}