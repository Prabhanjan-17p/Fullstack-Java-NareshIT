package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.PaymentProcessor;

@SpringBootApplication
public class Day15Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = SpringApplication.run(Day15Application.class, args);){
			PaymentProcessor processor = context.getBean(PaymentProcessor.class);
	        processor.makePayment(1000.00);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
