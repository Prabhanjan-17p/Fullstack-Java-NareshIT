package com.nt.maneger;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.nt.service.NotificationService;

@Component
public class NotificationManager {
	private final List<NotificationService> notificationServices;
	private final Map<String, NotificationService> notificationServiceMap;

	public NotificationManager(List<NotificationService> notificationServices,
			Map<String, NotificationService> notificationServiceMap) {
		super();
		this.notificationServices = notificationServices;
		this.notificationServiceMap = notificationServiceMap;
	}
	
	public void sendToAll(String msg) {
		for(NotificationService notser : notificationServices) {
			notser.send(msg);
		}
	}
	
	public void sendToChannel(String channel, String msg) {
		NotificationService service = notificationServiceMap.get(channel.toLowerCase());
        if (service != null) {
            service.send(msg);
        } else {
            System.out.println("No such channel: " + channel);
        }
	}

}
