package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Player;

@Service("plySer")
public class PlayerService {
	@Autowired
	private Player player;

	public void displayPlayerInfo() {
		System.out.println("Player ID: " + player.getPlayerId());
		System.out.println("Player Name: " + player.getPlayerName());
		System.out.println("Jersey Number: " + player.getYearsNumber());
		System.out.println("Team Name: " + player.getTeamName());
	}
}
