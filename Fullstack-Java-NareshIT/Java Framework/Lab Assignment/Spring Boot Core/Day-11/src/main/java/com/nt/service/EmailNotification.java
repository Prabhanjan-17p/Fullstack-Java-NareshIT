package com.nt.service;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotification implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("Sending Email: " + message);
	}

}
