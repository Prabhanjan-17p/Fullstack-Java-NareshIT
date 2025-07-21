package com.nit.sbean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("email")
@Primary 
public class EmailNotificationService implements NotificationService {

	@Override
	public void sendMSG(String message) {
		System.out.println("Send massege through Email!! :: " + message);
	}

}
