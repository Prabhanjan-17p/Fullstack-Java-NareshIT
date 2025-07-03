package com.nt.sbeans;

import java.time.LocalTime;
import java.util.Iterator;

public class WishMSGGanerator {
	private LocalTime lDate;
	
	
	public void setlDate(LocalTime lDate) {
		System.out.println("WishMSGGanerator.setlDate()");
		this.lDate = lDate;
	}

	public WishMSGGanerator() {
		System.out.println("WishMSGGanerator.WishMSGGanerator()");
	}
	
	public String generateMSG(String user) {
		System.out.println("WishMSGGanerator.generateMSG()");
		int hour = lDate.getHour();
		
		if (hour < 12) return "Good Morning :: "+user;
		else if(hour < 16) return "Good Aftermoon :: "+user;
		else if(hour < 16) return "Good Evening :: "+user;
		else return "Good Night :: "+user;
		
	}
	
}
