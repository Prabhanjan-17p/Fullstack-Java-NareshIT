package com.nit.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbean.BillingApp;
import com.nit.sbean.CabCustomerService;

@Configuration
@ComponentScan(basePackages = "com.nit.sbean")
public class AppConfig {
	@Bean
	@Qualifier("customerService")
	public CabCustomerService cabCustomerService() {
		return new CabCustomerService();
	}

	@Bean
	@Qualifier("billingApp")
	public BillingApp billingApp(@Qualifier("customerService") CabCustomerService service) {
		BillingApp app = new BillingApp();
		app.setCustomerService(service); // Only service set initially
		return app;
	}

}
