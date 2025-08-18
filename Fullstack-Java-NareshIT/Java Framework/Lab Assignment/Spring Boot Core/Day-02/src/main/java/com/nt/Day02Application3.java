package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.AgeService;
import com.nt.sbean.InterestService;
import com.nt.sbean.TemperatureService;

@SpringBootApplication
public class Day02Application3 {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(Day02Application3.class, args);
				Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter your age: ");
			int no= sc.nextInt();
			AgeService service = context.getBean(AgeService.class);
			String tot = service.verifyAge(no);
			System.out.println("You are an "+tot+".");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
