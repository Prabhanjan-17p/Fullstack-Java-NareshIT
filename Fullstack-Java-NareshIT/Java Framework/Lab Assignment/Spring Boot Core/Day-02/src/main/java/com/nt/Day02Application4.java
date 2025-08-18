package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.AgeService;
import com.nt.sbean.GradeService;
import com.nt.sbean.InterestService;
import com.nt.sbean.LeapYearService;
import com.nt.sbean.TemperatureService;

@SpringBootApplication
public class Day02Application4 {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(Day02Application4.class, args);
				Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter year: ");
			int no= sc.nextInt();
			LeapYearService service = context.getBean(LeapYearService.class);
			String tot = service.checkLeapYear(no);
			System.out.println(tot+" is a Leap Year.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
