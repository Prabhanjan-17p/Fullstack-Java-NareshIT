package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("billingApp")
public class BillingApp {
	//HAS-A relation
	private CabCustomer customer;
	private CabCustomerService customerService;
	
	//Setter Injection
	public void setCustomerService(CabCustomerService customerService) {
        this.customerService = customerService;
    }

    public void setCustomer(CabCustomer customer) {
        this.customer = customer;
    }
	
	public String printBill() {
		customerService.addCustomer(customer); // Must add before checking isFirstCustomer
		return customer.getCustomerName() + ", please pay your bill of Rs." + customerService.calculateBill(customer);
	}

	
}
