package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.Customer;

public class Main2 {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);) {

			Customer customer = context.getBean(Customer.class);

			customer.setCustomerId(101);
			customer.setCustomerName("Prabhanjan");

			// Set bank type (SBI or HDFC)
			customer.setBank("SBI");

			// Perform deposit and withdraw operations
			customer.deposit(5000.0);
			customer.withdraw(1500.0);

			// Display customer and bank details
			customer.displayDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}