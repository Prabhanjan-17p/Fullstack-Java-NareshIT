package com.nareshIT.day14;

public class Batter {
	 String name;
	 int runs ;
	 int matches;
	 float batting_avg;
	 
	 public void batterDetails(String n,int r ,int m) {
	   if (r <= -1 || m <= -1 ) {
				System.out.println("Error");
				return ;
		}
		if ((m == 0) && (r >= 0)) {
			System.out.println("Error");
			return ;
		}
		name =n;
		runs = r;
		matches = m;
		
		calBA(runs , matches);
		getBatterDetails();
	}

	private void calBA(int runs2, int matches2) {
		batting_avg = (float) runs2/matches2;
	}
	
	public void getBatterDetails() {
		System.out.println("Name : "+name );
		System.out.println("runs : "+runs );
		System.out.println("matches : "+matches );
		System.out.println("batting_avg : "+batting_avg );
	}

}
