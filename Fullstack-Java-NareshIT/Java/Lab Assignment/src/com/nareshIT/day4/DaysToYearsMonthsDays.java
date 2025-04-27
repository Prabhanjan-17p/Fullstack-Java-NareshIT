package com.nareshIT.day4;

public class DaysToYearsMonthsDays {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(" provide the number of days :");
            return;
        }

      
            int totalDays = Integer.parseInt(args[0]);

            int years = totalDays / 365;
            int remainingDaysAfterYear = totalDays % 365;

            int months = remainingDaysAfterYear / 30;
            int remainingDays = remainingDaysAfterYear % 30;

            System.out.println("Total Days: " + totalDays);
            System.out.println("Equivalent to: " + years + " years, " + months + 
            		" months, and " + remainingDays + " days.");
       
    }
}
