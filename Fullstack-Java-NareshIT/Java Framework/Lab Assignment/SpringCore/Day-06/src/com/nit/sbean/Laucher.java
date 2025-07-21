package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laucher {
	private Rocket rock;

	@Autowired
	public void setRock(Rocket rock) {
		this.rock = rock;
	}
	
	public void launch(){
		rock.ignite("full");
	}
}
