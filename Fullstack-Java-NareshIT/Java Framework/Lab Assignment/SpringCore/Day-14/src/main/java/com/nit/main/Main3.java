package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.Address;
import com.nit.sbean.Flight;
import com.nit.sbean.FoodService;
import com.nit.sbean.Player;
import com.nit.sbean.PlayerService;
import com.nit.sbean.User;

public class Main3 {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			Flight flight = ctx.getBean(Flight.class);
			User user = ctx.getBean(User.class);
			Address address = ctx.getBean(Address.class);
			System.out.println(flight +"\n"+user+"\n"+address);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
