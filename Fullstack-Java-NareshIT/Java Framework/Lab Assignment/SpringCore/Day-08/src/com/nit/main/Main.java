package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.PaymentProcessor;

public class Main {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			PaymentProcessor pp = ctx.getBean(PaymentProcessor.class);
			pp.testAmount(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
