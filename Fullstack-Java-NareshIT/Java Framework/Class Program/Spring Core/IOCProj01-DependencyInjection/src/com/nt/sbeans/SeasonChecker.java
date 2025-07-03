package com.nt.sbeans;

import java.time.LocalDate;

public class SeasonChecker {
	
	private LocalDate currentDate;
	private String season;
	
    public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}

	public void showSeason() {
        int month = currentDate.getMonthValue();

        switch (month) {
            case 12: case 1: case 2:
                season = "Winter Season";
                break;
            case 3: case 4: case 5:
                season = "Summer Season";
                break;
            case 6: case 7: case 8: case 9:
                season = "Rainy Season";
                break;
            case 10: case 11:
                season = "Autumn Season";
                break;
            default:
                season = "Invalid month!";
        }

        System.out.println("Today's Date: " + currentDate);
        System.out.println("It is: " + season);
    }
}
