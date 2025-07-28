package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.FoodService;
import com.nit.sbean.Player;
import com.nit.sbean.PlayerService;

public class Main2 {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			FoodService foodService = ctx.getBean(FoodService.class);			
			foodService.displayFoodInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
