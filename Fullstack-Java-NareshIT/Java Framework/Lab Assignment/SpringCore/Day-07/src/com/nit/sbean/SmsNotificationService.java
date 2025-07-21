package com.nit.sbean;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsNotificationService implements NotificationService {

	@Override
	public void sendMSG(String message) {
		System.out.println("Send massege through SMS!! :: "+message);
	}

}
