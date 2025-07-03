package com.nit.sbean;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator {
	private LocalDate currentDate;
	private double price;
	
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void calculateDiscount() {
		DayOfWeek day = currentDate.getDayOfWeek();
		switch (day) {
		case FRIDAY: case MONDAY: case TUESDAY: case WEDNESDAY: case THURSDAY:
			System.out.println("Total amount :: "+price);
			System.out.println("10% discount :: "+(price*0.10));
			price -= price*0.10;
			System.out.println("Total pay amount :: "+price);
			break;
		case SUNDAY: case SATURDAY:
			System.out.println("Total amount :: "+price);
			System.out.println("20% discount :: "+(price*0.20));
			price -= price*0.20;
			System.out.println("Total pay amount :: "+price);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
	}
	
}
