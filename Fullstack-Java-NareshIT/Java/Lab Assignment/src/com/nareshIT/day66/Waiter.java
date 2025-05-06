package com.nareshIT.day66;

public class Waiter extends Thread {
	private Restaurant restaurant ;
	private String orderName  ;
	  
	public Waiter(Restaurant restaurant, String orderName) {
		super();
		this.restaurant = restaurant;
		this.orderName = orderName;
	}
	
	public void acceptOrder(String order) {
		Waiter w = new Waiter(restaurant, order);
		w.start();
	}
	
	
	@Override
	public void run() {
		restaurant.placeOrder(orderName);
	}
	  
}
