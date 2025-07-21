package com.nit.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("match")
public class CricketMatch {
    @Autowired
    private Team ind;

    @Autowired
    private Team aus;
    
    
    public void startMatch() {
		int indScore = ind.TeamScore();
		int ausScore = aus.TeamScore();
		
	    System.out.println("Team " + ind.TeamName() + " scored: " + indScore);
	    System.out.println("Team " + aus.TeamName() + " scored: " + ausScore);

        if (indScore > ausScore)
            System.out.println("Winner: " + ind.TeamName());
        else if (ausScore > indScore)
            System.out.println("Winner: " + aus.TeamName());
        else
            System.out.println("Match Draw");
	}
}
