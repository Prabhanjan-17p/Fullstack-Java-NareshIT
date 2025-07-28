package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.nit.sbean")
@PropertySource("com/nit/common/player.properties")
@PropertySource("com/nit/common/food.properties")
@PropertySource("com/nit/common/flightBooking.properties")
public class AppConfig {

}
