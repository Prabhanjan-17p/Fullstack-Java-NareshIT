package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("aus")
public class AustraliaTeam implements Team {

	@Override
	public String TeamName() {
		return "Australia";
	}

	@Override
	public int TeamScore() {
		return 180;
	}

}
