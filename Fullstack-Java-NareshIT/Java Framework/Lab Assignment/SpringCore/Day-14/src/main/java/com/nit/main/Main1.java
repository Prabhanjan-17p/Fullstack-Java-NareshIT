package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.Player;
import com.nit.sbean.PlayerService;

public class Main1 {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			PlayerService playerService = ctx.getBean(PlayerService.class);
			playerService.displayPlayerInfo();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
