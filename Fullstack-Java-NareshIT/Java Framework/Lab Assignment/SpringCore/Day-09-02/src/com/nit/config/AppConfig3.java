package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.book.Book;
import com.book.Library;

@Configuration
@ComponentScan(basePackages = "com.book")
public class AppConfig3 {

	@Bean
	public Book book() {
		return new Book();
	}

	@Bean
	public Library library() {
		return new Library(book());
	}
}
