package com.nit.sbean;


import java.util.ArrayList;
import java.util.List;

public class CabCustomerService {
	private List<CabCustomer> customersList = new ArrayList<>();

	public void addCustomer(CabCustomer customer) {
		customersList.add(customer);
	}

	public boolean isFirstCustomer(CabCustomer customer) {
		int count = 0;
		for (CabCustomer c : customersList) {
			if (c.getPhoneNumber().equals(customer.getPhoneNumber())) {
				count++;
			}
		}
		return count == 1;
	}

	public double calculateBill(CabCustomer customer) {
		if (isFirstCustomer(customer)) {
			return 0.0;
		}
		if (customer.getDistance() <= 4) {
			return 80.0;
		} else {
			return 80.0 + (customer.getDistance() - 4) * 6.0;
		}
	}
}

