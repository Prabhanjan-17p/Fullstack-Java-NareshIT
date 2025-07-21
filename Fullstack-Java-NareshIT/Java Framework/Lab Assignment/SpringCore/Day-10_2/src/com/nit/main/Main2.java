package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig2;
import com.nit.sbean2.FoodOrderApp;

public class Main2 {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class);) {
			FoodOrderApp foodOrderApp = ctx.getBean(FoodOrderApp.class);
			foodOrderApp.orderFood("idli");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
