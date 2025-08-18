package com.nit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.nit.model.Actor;


@Configuration
@PropertySource("com/nit/commons/actor.properties")
public class AppConfig {
	@Value("${actor.id}")
	private int id;
	@Value("${actor.name}")
	private String name;
	@Value("${actor.movies}")
	private String movies;
	
	@Bean
	public Actor actor() {
		Actor a = new Actor();
	    a.setId(id);
	    a.setName(name);
	    a.setMovies(movies);
	    return a;
	}
}
