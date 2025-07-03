package com.nit.sbean;

import java.time.LocalDateTime;

public class WishMessageGenerator {
	private LocalDateTime currentDateTime;

	public void setCurrentDateTime(LocalDateTime currentDateTime) {
		this.currentDateTime = currentDateTime;
	}
	
	public void printgenerateWishMessage() {
		int time = currentDateTime.getHour();
		
		if(time < 12) System.out.println("Good Morning");
		else if(time < 18) System.out.println("Good Afternoon");
		else System.out.println("Good Evening");
	}
}
