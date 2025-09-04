package com.nt.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.nt.model.Order;

@Component
public class Producer implements CommandLineRunner {
	@Autowired
	private JmsTemplate jmsTemplate;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sending orders...");

        Order order1 = new Order("101", "Kanha", "Laptop", 1);
        Order order2 = new Order("102", "Hari", "Mobile", 2);
        Order order3 = new Order("103", "Ritesh", "Headphones", 5);

        jmsTemplate.convertAndSend("order-queue", order1);
        jmsTemplate.convertAndSend("order-queue", order2);
        jmsTemplate.convertAndSend("order-queue", order3);

        System.out.println("Orders sent successfully!");
	}

}
