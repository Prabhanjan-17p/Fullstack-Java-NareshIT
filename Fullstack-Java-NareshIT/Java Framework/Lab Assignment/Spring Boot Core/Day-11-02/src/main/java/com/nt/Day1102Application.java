package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.maneger.DiscountProcessor;

@SpringBootApplication
public class Day1102Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Day1102Application.class, args);) {
			DiscountProcessor processor = ctx.getBean(DiscountProcessor.class);

			double cartAmount = 1000;

			System.out.println("\n--- Showing All Discounts ---");
			processor.showAllDiscounts(cartAmount);

			System.out.println("\n--- Applying Selected Discount (diwali) ---");
			double diwaliAmt = processor.applySelectedDiscount("diwali", cartAmount);
			System.out.println("Final Amount with Diwali Discount: " + diwaliAmt);

			System.out.println("\n--- Applying Invalid Discount (summer) ---");
			double summerAmt = processor.applySelectedDiscount("summer", cartAmount);
			System.out.println("Final Amount with Fallback: " + summerAmt);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
