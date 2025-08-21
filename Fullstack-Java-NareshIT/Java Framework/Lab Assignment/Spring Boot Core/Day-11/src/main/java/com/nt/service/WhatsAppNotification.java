package com.nt.service;

import org.springframework.stereotype.Service;

@Service("whatsapp")
public class WhatsAppNotification implements NotificationService {

	@Override
	public void send(String message) {
		if (message.length() > 100) {
			System.out.println("WhatsApp message too long. Not sending.");
		} else {
			System.out.println("Sending WhatsApp message: " + message);
		}
	}

}
