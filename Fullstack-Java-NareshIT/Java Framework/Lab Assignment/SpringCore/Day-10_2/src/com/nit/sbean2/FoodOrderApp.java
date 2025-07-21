package com.nit.sbean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodOrderApp {
	private BillingService billingService;

	@Autowired
	public FoodOrderApp(@Qualifier("nonveg") BillingService billingService) {
		super();
		this.billingService = billingService;
	}
	
	public void orderFood(String item) {
		double bill = billingService.getBill(item);
		System.out.println("Item Name :: "+item
				+ "\nPrice (Bill Amount) :: "+bill
				+ "\nMessage like \"Thank you for your order!\"");
	}
	
}
