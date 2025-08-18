package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("age")
public class AgeService {
	public String verifyAge(int age) {
		if(age > 18) return "Adult";
		else return "Minor";
	}
}
