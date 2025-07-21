package com.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.product.Product;

@Component
public class ProfitLoss {
	
	@Autowired
	private Product product;
	
	public void calculateProfit() {
		System.out.println("Profit: "+(product.getSellingPrice() - product.getCostPrice()));
		;
	}
}
