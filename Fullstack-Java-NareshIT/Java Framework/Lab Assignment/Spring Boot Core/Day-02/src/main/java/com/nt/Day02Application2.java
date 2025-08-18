package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.InterestService;
import com.nt.sbean.TemperatureService;

@SpringBootApplication
public class Day02Application2 {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(Day02Application2.class, args);
				Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter principal amount: ");
			double pri = sc.nextDouble();
			System.out.print("Enter rate of interest: ");
			double rat = sc.nextDouble();
			System.out.print("Enter time period in years: ");
			double yr = sc.nextDouble();
			InterestService service = context.getBean(InterestService.class);
			double tot = service.calculateSimpleInterest(pri, rat, yr);
			System.out.println("Simple Interest: "+tot);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
