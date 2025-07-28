package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = "com.nit.sbean")
public class AppConfig {
	
	@Bean(name = "messageSource")
	public ResourceBundleMessageSource createRBMS() {
		ResourceBundleMessageSource  rbms = new  ResourceBundleMessageSource();
		rbms.setBasename("com/nit/commons/messages");// confugre  base proerties file
		return rbms;
	}
}
