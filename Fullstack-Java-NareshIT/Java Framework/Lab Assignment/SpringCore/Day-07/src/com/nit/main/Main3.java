package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.ShipmentProcessor;

public class Main3 {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			ShipmentProcessor sp = ctx.getBean(ShipmentProcessor.class);
			sp.callDelivery("Mobile");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
