package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("plSer")
public class PlayerService {
	@Autowired
	private Player player;

	public void displayPlayerInfo() {
		System.out.println(player);
	}
}
