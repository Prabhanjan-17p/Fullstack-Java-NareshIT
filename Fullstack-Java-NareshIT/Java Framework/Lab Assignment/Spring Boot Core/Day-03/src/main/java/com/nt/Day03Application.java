package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.Service.PaymentService;
import com.nt.Strategy.PaymentStrategy;

@SpringBootApplication
public class Day03Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Day03Application.class, args);
				Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter amount to pay: ");
			double amt = sc.nextDouble();

			System.out.print("Choose payment method: 1. Credit Card 2. PayPal 3. UPI: ");
			int ch = sc.nextInt();

			PaymentStrategy strategy = switch (ch) {
			case 1 -> ctx.getBean("credit", PaymentStrategy.class);
			case 2 -> ctx.getBean("paypal", PaymentStrategy.class);
			case 3 -> ctx.getBean("upi", PaymentStrategy.class);
			default -> null;
			};

			if (strategy == null) {
				System.out.println("Invalid payment method selected.");
			} else {
				PaymentService paymentService = ctx.getBean(PaymentService.class);
				paymentService.setPaymentStrategy(strategy);
				paymentService.makePayment(amt);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
