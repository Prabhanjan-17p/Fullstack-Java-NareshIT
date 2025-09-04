package com.nt.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.nt.model.Order;

@Component
public class JMS_Reciever {
	
	
	@JmsListener(destination = "order-queue")
	public void readMessageConsumer(Order ord) {
		System.out.println("Recieved Message :: "+ord);
	}
}
