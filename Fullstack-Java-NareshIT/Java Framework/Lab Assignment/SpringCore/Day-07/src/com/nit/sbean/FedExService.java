package com.nit.sbean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("fed")
@Primary // make it as default
public class FedExService implements Shipping{

	@Override
	public void shipPackage(String name) {
		System.out.println(name+" Pass by FedEx !!");
	}

}
