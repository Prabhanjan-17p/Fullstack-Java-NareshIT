package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.PlayerService;

@SpringBootApplication
public class Day12Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Day12Application.class, args);

		PlayerService service = ctx.getBean(PlayerService.class);

		service.displayPlayerInfo();

		ctx.close();
	}

}
