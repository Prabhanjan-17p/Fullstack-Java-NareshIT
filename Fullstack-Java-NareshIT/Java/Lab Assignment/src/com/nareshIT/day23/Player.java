package com.nareshIT.day23;

public class Player {
	private int playerId ;		 
	private String playerName;    
	private int playerAge;
	
	public Player(Student s) {  // Copy Constructor
		this.playerId = s.getStudentId();
		this.playerName = s.getStudentName();
		this.playerAge = s.getStudentAge();
		
	}
	
	public void showDetails() {
		System.out.println("player id ="+playerId);
		System.out.println("player name ="+playerName);
		System.out.println("is Eligible "+isEligible());
	}
	public void updateName(String newName) {
		this.playerName = newName;
	}

	public boolean isEligible() {
		if (this.playerName.length() == 0) {
			System.err.println("Student Name can not be empty");
			System.exit(0);
		}
		if(this.playerAge < 0) {
			System.err.println("Student ID cannot be negative.");
			System.exit(0);
		}
		if(this.playerAge < 18) {
			return false;
		}else {
			return true;
		}
	}

	
	
}
