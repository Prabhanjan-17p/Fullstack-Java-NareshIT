package com.nt.runner;

import org.springframework.boot.CommandLineRunner;

import com.nt.maneger.NotificationManager;

public class TestRunner implements CommandLineRunner {
	private final NotificationManager notificationManager;

	public TestRunner(NotificationManager notificationManager) {
		this.notificationManager = notificationManager;
	}

	@Override
	public void run(String... args) throws Exception {
		String msg = "Hello, this is a notification!";
		String longMsg = "This is a very long WhatsApp message that exceeds the character limit of 100. "
				+ "It should not be sent over WhatsApp.";

		System.out.println("\n--- Sending to All Channels ---");
		notificationManager.sendToAll(msg);

		System.out.println("\n--- Sending specifically via Email ---");
		notificationManager.sendToChannel("email", msg);

		System.out.println("\n--- Sending long message via WhatsApp ---");
		notificationManager.sendToChannel("whatsapp", longMsg);
	}

}
