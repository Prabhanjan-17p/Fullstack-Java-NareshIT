package com.nt.service;

import org.springframework.stereotype.Service;

@Service("push")
public class PushNotification implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("Sending Push: " + message);
	}

}
