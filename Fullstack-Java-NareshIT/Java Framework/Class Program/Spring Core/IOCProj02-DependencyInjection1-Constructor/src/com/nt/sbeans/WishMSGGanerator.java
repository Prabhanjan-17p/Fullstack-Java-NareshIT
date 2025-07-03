package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMSGGanerator {
	//HAS-A relation
	private LocalTime lDate;
	private LocalDate date;
	
	//properties
	private int age;
	private String email;
	
	//Setter method
	public void setlDate(LocalTime lDate) {
		System.out.println("WishMSGGanerator.setlDate()");
		this.lDate = lDate;
	}

	public void setDate(LocalDate date) {
		System.out.println("WishMSGGanerator.setDate()");
		this.date = date;
	}

	public void setAge(int age) {
		System.out.println("WishMSGGanerator.setAge()");
		this.age = age;
	}

	public void setEmail(String email) {
		System.out.println("WishMSGGanerator.setEmail()");
		this.email = email;
	}

	// Constructor
	public WishMSGGanerator() {
		System.out.println("WishMSGGanerator.WishMSGGanerator()");
	}
	
	//parameterized Constructor
	public WishMSGGanerator(LocalTime lDate, LocalDate date, int age, String email) {
		super();
		System.out.println("WishMSGGanerator Paramterized Constructor");
		this.lDate = lDate;
		this.date = date;
		this.age = age;
		this.email = email;
	}
	
	
	
	public String generateMSG(String user) {
		System.out.println("WishMSGGanerator.generateMSG()");
		
		System.out.println("Name :: "+user +" Age :: "+age+" Email :: "+email+" Date ::"+date);
		
		int hour = lDate.getHour();
		
		if (hour < 12) return "Good Morning :: "+user;
		else if(hour < 16) return "Good Aftermoon :: "+user;
		else if(hour < 16) return "Good Evening :: "+user;
		else return "Good Night :: "+user;
		
	}
	
}
