package com.nit.sbean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("amazonService")
public class AmazonService implements ShoppingService {

	private final List<String> cartItems = new ArrayList<>();
	private final List<Double> prices = new ArrayList<>();

	@Override
	public void addItem(String item, double price) {
		cartItems.add(item);
		prices.add(price);
		System.out.println("Item added to Amazon cart.");
	}

	@Override
	public void viewCart() {
		if (cartItems.isEmpty()) {
			System.out.println("Amazon cart is empty.");
			return;
		}
		System.out.println("Amazon Cart Contents:");
		for (int i = 0; i < cartItems.size(); i++) {
			System.out.printf("%s: ₹%.2f%n", cartItems.get(i), prices.get(i));
		}
	}

	@Override
	public void checkout() {
		double total = prices.stream().mapToDouble(x -> x).sum();
		double discount = total * 0.10;
		double finalAmount = total - discount;

		System.out.printf("Total: ₹%.2f%n", total);
		System.out.printf("10%% Discount: ₹%.2f%n", discount);
		System.out.printf("Final Amount: ₹%.2f%n", finalAmount);
		System.out.println("Amazon offers fast delivery (within 2 days).");

		cartItems.clear();
		prices.clear();
	}

}
