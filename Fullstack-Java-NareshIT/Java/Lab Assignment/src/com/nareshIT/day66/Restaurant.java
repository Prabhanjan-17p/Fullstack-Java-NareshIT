package com.nareshIT.day66;

public class Restaurant {
	private String name;
	private String order;
	private boolean isOrderReady = false;
	
	public synchronized void placeOrder(String order) {
		System.out.println("Welcome to KFC Restaurant!!!");
		this.order = order;
		while(isOrderReady) {
			try {
				System.out.println("Waiter: Placed order for "+this.order);
				wait();
				System.out.println("Waiter: Serving the "+this.order);	
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void prepareOrder() {
		try {
			Thread.sleep(2000);
			System.out.println("Chef: Preparing fried chicken "+this.order);
			Thread.sleep(2000);
			System.out.println("Chef: "+this.order+" is Ready!");
			notify();
			isOrderReady = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
