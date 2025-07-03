package com.nit.sbean;

import java.time.LocalDate;

public class DatePrinter {
	private LocalDate ccurrentDate;

	public void setCcurrentDate(LocalDate ccurrentDate) {
		System.out.println("DatePrinter.setCcurrentDate()");
		this.ccurrentDate = ccurrentDate;
	}
	
	public void printDate() {
		System.out.println("Today's Date: "+ccurrentDate);
	}
}
