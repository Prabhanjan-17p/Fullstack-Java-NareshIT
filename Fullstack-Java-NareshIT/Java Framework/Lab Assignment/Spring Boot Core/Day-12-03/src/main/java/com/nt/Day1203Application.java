package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.nt.model.Flight;
import com.nt.model.User;

@SpringBootApplication
@PropertySource("classpath:flightBooking.properties")
public class Day1203Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Day1203Application.class, args);

        Flight flight = ctx.getBean(Flight.class);
        User user = ctx.getBean(User.class);

        System.out.println("=== Flight Booking Info ===");
        System.out.println(flight);
        System.out.println(user);

        ctx.close();
    }
}
