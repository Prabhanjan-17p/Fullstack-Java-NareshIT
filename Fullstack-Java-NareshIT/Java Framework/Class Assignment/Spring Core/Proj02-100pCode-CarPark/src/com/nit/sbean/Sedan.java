package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("sedan")
public class Sedan implements Car{

	@Override
	public String getCarType() {
		return "Sedan";
	}
}
