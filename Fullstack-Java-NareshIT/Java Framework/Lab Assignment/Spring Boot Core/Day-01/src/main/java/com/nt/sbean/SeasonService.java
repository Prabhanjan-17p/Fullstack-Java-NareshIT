package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("ss")
public class SeasonService {
	public String getSeason(int month) {
		if (month >= 3 && month<=6) return "Summer Season!!!";
		else if (month >= 7 && month<=9) return "Rainy Season!!!";
		else return "Winter Season";
	}
}
