package com.nit.sbean;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wf") // Marks this class as a Spring-managed bean with the ID "wf"
public class WeekEndDay {

    @Autowired // Field injection: Spring will inject the bean of type LocalDate (from AppConfig)
    private LocalDate date;

    public WeekEndDay() {
        System.out.println("WeekEndDay::0-parameter");
    }

    // Business logic method to return greeting based on day of the week
    public String greetMSG(String name) {
        int day = date.getDayOfWeek().getValue(); // 1 (Monday) to 7 (Sunday)
        if(day != 6 && day != 7)
            return "Working Day :: Week Day :: " + name;
        else
            return "Happy Week End :: Week End :: " + name;
    }

}
