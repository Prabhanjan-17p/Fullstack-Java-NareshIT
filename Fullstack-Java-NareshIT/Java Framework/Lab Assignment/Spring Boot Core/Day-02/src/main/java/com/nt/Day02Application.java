package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.TemperatureService;

@SpringBootApplication
public class Day02Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(Day02Application.class, args);
				Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Temperatur in celsius :: ");
			double cal = sc.nextDouble();
			TemperatureService service = context.getBean(TemperatureService.class);
			double convertToFahrenheit = service.convertToFahrenheit(cal);
			System.out.println("Temperature in Fahrenheit: "+convertToFahrenheit);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
