package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("suv")
public class SUV implements Car{

	@Override
	public String getCarType() {
		return "SUV";
	}
}
