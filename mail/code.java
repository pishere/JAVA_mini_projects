import java.util.*; 
import javax.mail.*; 
import javax.mail.internet.*; 
import javax.activation.*; 
import javax.mail.Session; 
import javax.mail.Transport; 


public class SendEmail 
{ 

public static void main(String [] args) 
{	 
	// email ID of Recipient. 
	String recipient = "recipient@gmail.com"; 

	// email ID of Sender. 
	String sender = "sender@gmail.com"; 

	// using host as localhost 
	String host = "127.0.0.1"; 

	// Getting system properties 
	Properties properties = System.getProperties(); 
	properties.setProperty("mail.smtp.host", host); 
	Session session = Session.getDefaultInstance(properties); 

	try
	{ 

		MimeMessage message = new MimeMessage(session); 
 
		message.setFrom(new InternetAddress(sender)); 

		
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); 

		
		message.setSubject("Birthday Wishes"); 

		 
		message.setText("Wishing you a Happy birthday !"); 

		
		Transport.send(message); 
		System.out.println("Mail successfully sent"); 
	} 
	catch (MessagingException mex) 
	{ 
		mex.printStackTrace(); 
	} 
} 
} 
