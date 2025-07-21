package com.nit.sbean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("flipkartService")
public class FlipkartService implements ShoppingService {

	private final List<String> cartItems = new ArrayList<>();
	private final List<Double> prices = new ArrayList<>();

	@Override
	public void addItem(String item, double price) {
		cartItems.add(item);
		prices.add(price);
		System.out.println("Item added to Flipkart cart.");
	}

	@Override
	public void viewCart() {
		if (cartItems.isEmpty()) {
			System.out.println("Flipkart cart is empty.");
			return;
		}
		System.out.println("Flipkart Cart Contents:");
		for (int i = 0; i < cartItems.size(); i++) {
			System.out.printf("%s: ₹%.2f%n", cartItems.get(i), prices.get(i));
		}
	}

	@Override
	public void checkout() {
		double total = prices.stream().mapToDouble(Double::doubleValue).sum();
		double discount = total * 0.05;
		double discountedTotal = total - discount;

		double deliveryCharge = discountedTotal >= 500 ? 0 : 50;
		double finalAmount = discountedTotal + deliveryCharge;

		System.out.printf("Total: ₹%.2f%n", total);
		System.out.printf("5%% Discount: ₹%.2f%n", discount);
		System.out.printf("Delivery Charge: ₹%.2f%n", deliveryCharge);
		System.out.printf("Final Amount: ₹%.2f%n", finalAmount);
		System.out.println("Flipkart offers standard delivery (3–5 days).");

		cartItems.clear();
		prices.clear();
	}

}
