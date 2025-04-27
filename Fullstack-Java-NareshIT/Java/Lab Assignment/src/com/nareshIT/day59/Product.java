package com.nareshIT.day59;

public class Product {
	int id;
	String name;
	double price;
	int quantity;
	
	public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void decreaseQuantity(int DeQnt) throws InsufficientQuantityException{
		if (quantity < DeQnt) {
			throw new InsufficientQuantityException("Insufficient Quantity");
		}else {
			this.quantity -= DeQnt;
		}
	}
	
}


