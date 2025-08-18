package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.SeasonService;

@SpringBootApplication
public class Day01Application {
	

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Day01Application.class, args);
				Scanner sc = new Scanner(System.in)) {
			SeasonService bean = ctx.getBean(SeasonService.class);
			System.out.print("Enter your month number :: ");
			int mon = sc.nextInt();
			if (mon >= 1 && mon <= 12) {
				String season = bean.getSeason(mon);
				System.out.println(season);
			}else {
				System.err.println("Invalid month! Please enter 1–12.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
