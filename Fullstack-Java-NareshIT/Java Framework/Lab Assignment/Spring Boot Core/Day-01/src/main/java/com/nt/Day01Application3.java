package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.DiscountService;
import com.nt.sbean.NumberService;
import com.nt.sbean.SeasonService;

@SpringBootApplication
public class Day01Application3 {
	

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Day01Application3.class, args);
				Scanner sc = new Scanner(System.in)) {
			NumberService bean = ctx.getBean(NumberService.class);
			System.out.print("Enter a number to check \"Odd or Even\" :: ");
			int num = sc.nextInt();
			System.out.println(bean.checkOddEven(num));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
