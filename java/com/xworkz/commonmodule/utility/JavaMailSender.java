package com.xworkz.commonmodule.utility;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class JavaMailSender {

	public static void main(String[] args) {
		JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
		mailSenderImpl.setHost("smtp.gmail.com");
		mailSenderImpl.setPort(587);
		mailSenderImpl.setUsername("veeresh.xworkz@gmail.com");
		mailSenderImpl.setPassword("veeresh@123");

		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "true");

		mailSenderImpl.setJavaMailProperties(javaMailProperties);

		String[] bccs = { "veereshdm022@gmail.com", "sharan.xworkz@gmail.com", "xworkzodc01@gmial.com" };
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("veeresh.xworkz@gmail.com");
		message.setTo("veereshdm022@gmail.com");
		message.setBcc(bccs);
		message.setSubject("Demo Mail Sender");
		message.setText("Hello Everyone \n I am Veeresh  \n From Xworkz \n besafe behappy ");

		mailSenderImpl.send(message);
	}

}
