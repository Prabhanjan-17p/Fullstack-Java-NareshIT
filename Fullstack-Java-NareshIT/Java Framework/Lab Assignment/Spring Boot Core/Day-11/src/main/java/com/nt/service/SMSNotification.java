package com.nt.service;

import org.springframework.stereotype.Service;

@Service("msg")
public class SMSNotification implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("Sending SMS: " + message);
	}

}
