package com.anish.flightreservation.FlightReservation.util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	@Value("${email_body}")
	private  String Email_Body;
	@Value("${email_subject}")
	private String Email_Subject;

	private static final Logger LOGGER = LoggerFactory.getLogger(EmailUtil.class);

	@Autowired
	private JavaMailSender sender;

	public void sendTicket(String toAddress, String filePath) {
		LOGGER.info("Inside sendTicket method " + toAddress + "  " + filePath);
		MimeMessage message = sender.createMimeMessage();

		try {
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
			messageHelper.setTo(toAddress);
			messageHelper.setSubject(Email_Subject);
			messageHelper.setText(Email_Body);
			messageHelper.addAttachment("Ticket", new File(filePath));
			sender.send(message);
		} catch (MessagingException e) {
			LOGGER.info("Inside sendTicket method " + e);
		}
	}
}
