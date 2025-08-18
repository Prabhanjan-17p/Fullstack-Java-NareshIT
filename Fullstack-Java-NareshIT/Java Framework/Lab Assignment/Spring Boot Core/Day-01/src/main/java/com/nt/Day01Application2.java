package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.DiscountService;
import com.nt.sbean.SeasonService;

@SpringBootApplication
public class Day01Application2 {
	

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Day01Application2.class, args);
				Scanner sc = new Scanner(System.in)) {
			DiscountService bean = ctx.getBean(DiscountService.class);
			System.out.print("Enter price of the product :: ");
			int pric = sc.nextInt();
			System.out.print("Enter discount :: ");
			int dis = sc.nextInt();
			
			double discount = bean.applyDiscount(pric, dis);
			System.out.println("Final price after discount: $"+(pric-discount));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
