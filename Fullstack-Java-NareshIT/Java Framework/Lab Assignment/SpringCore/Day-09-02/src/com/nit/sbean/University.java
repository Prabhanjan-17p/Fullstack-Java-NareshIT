package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component
public class University {
	private String name;

	public University(String name) {
		super();
		this.name = name;
	}
	
	public String getUniversityName() {
		return this.name;
	}
	
}
