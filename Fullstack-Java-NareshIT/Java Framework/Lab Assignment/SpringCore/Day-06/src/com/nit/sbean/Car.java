package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("c1")
public class Car {
	private Engine eng;

	@Autowired
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		eng.start("petrol",48, 37);
	}
	
}
