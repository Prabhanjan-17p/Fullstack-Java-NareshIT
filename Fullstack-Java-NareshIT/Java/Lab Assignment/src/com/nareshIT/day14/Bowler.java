package com.nareshIT.day14;

public class Bowler {
	  String name;
	  int wickets;
	  int matches;
	  int balls_bowled;
	  int runs_conceded;
	  
	  public void bowlerDetails(String n,int w, int m,
			  int bb ,int rc) {
		if (w <= -1 || m <= -1 ||  bb <= -1 || rc <= -1) {
			System.out.println("Error");
			return ;
		}
		name = n;
		wickets = w;
		matches = m;
		balls_bowled = bb;
		runs_conceded = rc ;
		
		if ((matches == 0) && (runs_conceded >= 0 || balls_bowled >= 0)) {
			System.out.println("Error");
			return ;
		}
		showDet();
		calAvg(runs_conceded,wickets);
		calStrik(runs_conceded , balls_bowled);
	}

	private void showDet() {
		System.out.println("Name : "+name);
		System.out.println("wickets : "+wickets);
		System.out.println("matches : "+matches);
		System.out.println("balls_bowled : "+balls_bowled);
		System.out.println("runs_conceded : "+runs_conceded);
	}

	private void calStrik(int rc ,int bb) {
//		System.out.println("Name : "+name);
		double st = (double)rc/ bb;
		System.out.println("Strike_rate : "+st);
	}

	private void calAvg(int run, int wit) {
//		System.out.println("Name : "+name);
		double avg = (double) run/wit;
		System.out.println("Bolwing avg  : "+avg);
	}
}
