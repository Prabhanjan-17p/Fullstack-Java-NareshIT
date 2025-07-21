package com.nit.sbean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Notifier {
	
	private NotificationService noti;

	@Autowired
	
//	public Notifier(@Qualifier("sms")NotificationService noti) {
//	public Notifier(@Qualifier("email")NotificationService noti) {
	public Notifier(NotificationService noti) {

		super();
		this.noti = noti;
	}
	
	public void notifyUser(String message) {
		noti.sendMSG(message);
	}
}
