package com.nit.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.ShoppingContext;
import com.nit.sbean.ShoppingService;

public final class ShoppingApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Scanner scanner = new Scanner(System.in);

		System.out.println("=== Welcome to the Shopping Cart System ===");
		System.out.println("Choose a platform to start shopping:");
		System.out.println("1. Amazon");
		System.out.println("2. Flipkart");
		System.out.print("Enter your choice: ");
		int platformChoice = scanner.nextInt();
		scanner.nextLine(); // consume newline

		ShoppingService shoppingService = null;

		switch (platformChoice) {
		case 1:
			shoppingService = context.getBean("amazonService", ShoppingService.class);
			break;
		case 2:
			shoppingService = context.getBean("flipkartService", ShoppingService.class);
			break;
		default:
			System.out.println("Invalid platform choice. Exiting.");
			context.close();
			return;
		}

		ShoppingContext shoppingContext = new ShoppingContext(shoppingService);

		while (true) {
			System.out.println("\n--- Shopping Menu ---");
			System.out.println("1. Add Item to Cart");
			System.out.println("2. View Cart");
			System.out.println("3. Checkout");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int userChoice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			switch (userChoice) {
			case 1:
				System.out.print("Enter item name: ");
				String itemName = scanner.nextLine();
				System.out.print("Enter item price: ₹");
				double price = scanner.nextDouble();
				scanner.nextLine(); // consume newline
				shoppingContext.addItem(itemName, price);
				break;

			case 2:
				shoppingContext.viewCart();
				break;

			case 3:
				shoppingContext.checkout();
				break;

			case 4:
				System.out.println("Thank you for shopping with us!");
				context.close();
				return;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}