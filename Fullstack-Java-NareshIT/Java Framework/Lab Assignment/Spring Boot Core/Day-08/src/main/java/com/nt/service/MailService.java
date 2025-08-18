package com.nt.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component("mailSer")
public class MailService {
	@Autowired
	private JavaMailSender sendMail;
	
	@Value("${spring.mail.username}")
	private String fromMail;
	
	
	public String sendMails(String to, String subject, String text)  throws Exception {
		MimeMessage message = sendMail.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		helper.setFrom(fromMail);
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setSentDate(new Date());
		helper.setText(text);
		sendMail.send(message);
		return "mail sent sucessfully done.";
	}
}
