package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonChecker;

public class DependencyInjectionSeasonTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/SeasonContext.xml");
		
		Object obj = ctx.getBean("season");
		
		SeasonChecker seasonChecker = (SeasonChecker)obj;
		
		seasonChecker.showSeason();
	}

}
