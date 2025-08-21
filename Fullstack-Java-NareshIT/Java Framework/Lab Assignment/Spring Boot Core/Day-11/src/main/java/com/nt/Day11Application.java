package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.maneger.NotificationManager;
import com.nt.service.NotificationService;

@SpringBootApplication
public class Day11Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Day11Application.class, args);) {
			NotificationManager notificationManager = ctx.getBean(NotificationManager.class);

			String msg = "Hello, this is a notification!";
			String longMsg = "This is a very long WhatsApp message that exceeds the character limit of 100. "
					+ "It should not be sent over WhatsApp.";

			System.out.println("\n--- Sending to All Channels ---");
			notificationManager.sendToAll(msg);

			System.out.println("\n--- Sending specifically via Email ---");
			notificationManager.sendToChannel("email", msg);

			System.out.println("\n--- Sending long message via WhatsApp ---");
			notificationManager.sendToChannel("whatsapp", longMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
