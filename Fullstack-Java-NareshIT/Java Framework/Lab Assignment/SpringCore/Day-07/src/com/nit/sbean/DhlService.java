package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DhlService implements Shipping{

	@Override
	public void shipPackage(String name) {
		System.out.println(name+" Pass by DHL !!");
	}

}