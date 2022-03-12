package api.mail;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class SendMail {
	public static void main(String[] args) throws AddressException, MessagingException {
		
		Javamail send = new Javamail();
		send.sendMail("dkrnq@naver.com");
	
	}
}
