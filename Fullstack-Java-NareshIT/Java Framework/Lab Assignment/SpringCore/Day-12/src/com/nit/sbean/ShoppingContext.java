package com.nit.sbean;

public class ShoppingContext {
	private ShoppingService shoppingService;

	public ShoppingContext(ShoppingService shoppingService) {
		super();
		this.shoppingService = shoppingService;
	}

	public void addItem(String item, double price) {
		shoppingService.addItem(item, price);
	}

	public void viewCart() {
		shoppingService.viewCart();
	}

	public void checkout() {
		shoppingService.checkout();
	}
}
