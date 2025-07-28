package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("foodser")
public class FoodService {
	@Autowired
	private FoodDetails foodDetails;
	
	public void displayFoodInfo() {
		System.out.println(foodDetails);
	}
}
