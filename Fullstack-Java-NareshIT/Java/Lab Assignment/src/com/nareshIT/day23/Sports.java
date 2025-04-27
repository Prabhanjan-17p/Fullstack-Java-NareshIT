package com.nareshIT.day23;

import java.util.Scanner;

public class Sports {
	private String sportName;
	private int teamSize;
	private String sportType;
	
	public Sports() {
		
	}

	public Sports(String sportName, int teamSize) {
		if (teamSize <= 0) {
			System.err.println("Team size must be positive.");
			System.exit(0);
		}
		this.sportName = sportName;
		this.teamSize = teamSize;
	}

	public Sports(String sportName, int teamSize, String sportType) {
		if (teamSize <= 0) {
			System.err.println("Team size must be positive.");
			System.exit(0);
		}
		this.sportName = sportName;
		this.teamSize = teamSize;
		this.sportType = sportType;
	}
	
	public void displayInfo() {
		System.out.println("Sport Name:"); 
		System.out.println("Team Size:"); 
		System.out.println("Sport Type:"); 
	}
}
