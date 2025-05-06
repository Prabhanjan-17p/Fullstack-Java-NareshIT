package com.nareshIT.day66;

public class RestaurantSystem {

	public static void main(String[] args) {
		Restaurant res = new Restaurant();
		res.setName("KFC");
		Waiter wet = new Waiter(res, "fried chicken");
		wet.acceptOrder("fried chicken");
		Chef ch = new Chef(res);
		ch.start();
	}

}
