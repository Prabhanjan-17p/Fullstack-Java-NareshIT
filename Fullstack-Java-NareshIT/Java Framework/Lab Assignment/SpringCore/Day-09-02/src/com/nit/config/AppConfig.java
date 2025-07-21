package com.nit.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbean.Student;
import com.nit.sbean.University;

@Configuration
public class AppConfig {
	@Bean
	public University delhiUniversity() {
		return new University("Delhi University");
	}

	@Bean
	public University oxfordUniversity() {
		return new University("Oxford University");
	}

	@Bean
	public Student student(@Qualifier("delhiUniversity") University university) {
		return new Student(university);
	}
}
