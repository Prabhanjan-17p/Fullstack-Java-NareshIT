package com.nit.sbean;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wf")
public class WeekEndDay {

    @Autowired
//    @Qualifier("ldate") //2
    private LocalDate date;

    public WeekEndDay() {
        System.out.println("WeekEndDay::0-parameter");
    }

    public String greetMSG(String name) {
        int day = date.getDayOfWeek().getValue(); 
        System.out.println("WeekEndDay.greetMSG()::"+date);
        if(day != 6 && day != 7)
            return "Working Day :: Week Day :: " + name;
        else
            return "Happy Week End :: Week End :: " + name;
    }

}
