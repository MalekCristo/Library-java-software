package Project;


import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Administrator
 */
public class Javamail {
// receipient of the email

    public static void sendMail(String recepient, int nbd) throws MessagingException {
        System.out.println("Preparing to send the email");
        //config properties 
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        String acct = "projectjava2022@gmail.com";
        String pwd = "ProjectJava123";
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(acct, pwd);
            }
        }
        );
        Message message = prepareMessage(session, acct, recepient,nbd);
        Transport.send(message);
        System.out.print("Message Sent successfully");

    }

    private static Message prepareMessage(Session session, String acct, String recepient, int nbd) throws AddressException, MessagingException {
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(acct));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
        message.setSubject("Book due date");
        message.setText("Dear Student, \n Your book is due in "+ nbd +" days, please refer back to the library to either extend ur "
                + "period or give the book back");

        return message;
    }
}
