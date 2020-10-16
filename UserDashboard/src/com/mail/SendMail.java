package com.mail;



import java.util.Properties;

import javax.mail.*;

import javax.mail.internet.*;

 

public class SendMail {

 

    public static void send(String m, String sub, String messg) {

 

        final String user = "your email here";

        final String pass = "your email password";

 

        Properties props = new Properties();

        props.put("mail.transport.protocol", "smtp");

        props.put("mail.smtp.host", "smtp.gmail.com");

        props.put("mail.smtp.auth", "true");

        props.put("mail.smtp.starttls.enable", "true");

        props.put("mail.host", "gmail");

        props.put("mail.user", "your email here");

        props.put("mail.password", "your password here");

//        props.put("mail.port", "465");
        props.put("mail.smtp.port", "587");
//        props.put("mail.smtp.host", "smtp.gmail.com");//change accordingly  
//        props.put("mail.smtp.auth", "true");  
 

        Session session = Session.getDefaultInstance(props,

                new javax.mail.Authenticator() {

                    @Override

                    protected PasswordAuthentication getPasswordAuthentication() {

                        return new PasswordAuthentication(user, pass);

                    }

                });

 

        try {

            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(user));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(m));

            message.setSubject(sub);

            message.setText(messg);

 

            Transport.send(message);

 

            System.out.println("Done");

 

        } catch (MessagingException e) {

            throw new RuntimeException(e);

        }

 

    }
}