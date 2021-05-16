package com.task.setget;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailSend 
{
public static void main(String[] args) throws MessagingException, IOException {
	
	String RECIPIENT = "tanay.saxena002@gmail.com";

	String from = "apnacafepro@gmail.com";
	String pass = "makemytrip007008";
	String[] to = { RECIPIENT };

	String subject = "Generate New OTP";
	String body = "Hello,Your new Generated OTP is : ";

	Properties props = System.getProperties();
	String host = "smtp.gmail.com";
	props.put("mail.smtp.starttls.enable", "true"); 
	props.put("mail.smtp.ssl.trust", host);
	props.put("mail.smtp.user", from);
	props.put("mail.smtp.password", pass);
	props.put("mail.smtp.port", "587");
	props.put("mail.smtp.auth", "true");
	Session session = Session.getDefaultInstance(props);
	Message message = new MimeMessage(session);
   message.setSubject(subject);
	try {

		message.setFrom(new InternetAddress(from));
		InternetAddress[] toAddress = new InternetAddress[to.length];
		for( int i = 0; i < to.length; i++ ) {
			toAddress[i] = new InternetAddress(to[i]);
		}

		for( int i = 0; i < toAddress.length; i++) {
			message.addRecipient(Message.RecipientType.TO, toAddress[i]);
		}
		 MimeBodyPart messageBodyPart = new MimeBodyPart();

         // Now set the actual message
      messageBodyPart.setText("Daily Report of");
     
         Multipart multipart = new MimeMultipart();
         MimeBodyPart attachPart = new MimeBodyPart();
         String filename = "C:/var/www/excelMy.xlsx";
         String filename2 = "C:/var/www/pl.zip";
         
         attachPart.attachFile(filename);
         attachPart.attachFile(filename2);
         multipart.addBodyPart(messageBodyPart);
         multipart.addBodyPart(attachPart);
         

         DataSource source = new FileDataSource(filename);
         messageBodyPart.setDataHandler(new DataHandler(source));
         messageBodyPart.setFileName(filename);
         multipart.addBodyPart(messageBodyPart);
   
         message.setContent(multipart);
		
		
		Transport transport = session.getTransport("smtp");
		transport.connect(host, from, pass);
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}
	catch (AddressException ae) {
		ae.printStackTrace();
	}
	catch (MessagingException me) {
		me.printStackTrace();
	}
}
}
