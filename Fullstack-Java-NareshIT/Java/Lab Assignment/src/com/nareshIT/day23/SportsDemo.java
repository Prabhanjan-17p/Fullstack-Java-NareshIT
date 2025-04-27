package com.nareshIT.day23;

import java.util.Scanner;

public class SportsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Sport Name:");
		String nameSport = sc.nextLine();
		
		System.out.print("Team Size:");
		int sizeTeam = sc.nextInt();
		
		System.out.print("Sport Type:");
		String nameType = sc.nextLine();
		nameType = sc.nextLine();
		
		Sports s = new Sports(nameSport,sizeTeam,nameType);
		s.displayInfo();

	}

}
