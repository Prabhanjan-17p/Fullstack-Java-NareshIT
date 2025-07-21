package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("ind")
public class IndiaTeam implements Team {

	@Override
	public String TeamName() {
		return "India";
	}

	@Override
	public int TeamScore() {
		return 181;
	}

}
