package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.FoodDetails;

@Service
public class FoodService {

	@Autowired
	private FoodDetails foodDetails;

	public void displayFoodInfo() {
		System.out.println("Food ID: " + foodDetails.getFoodId());
		System.out.println("Food Name: " + foodDetails.getFoodName());
		System.out.println("Preparation Time: " + foodDetails.getPreparationTime() + " mins");
		System.out.println("Restaurant Name: " + foodDetails.getRestaurantName());
	}
}