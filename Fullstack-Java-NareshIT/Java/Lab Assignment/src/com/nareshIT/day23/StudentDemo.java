package com.nareshIT.day23;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student(1,"",-17);
		
		Player p = new Player(s);
		p.showDetails();
	}

}
