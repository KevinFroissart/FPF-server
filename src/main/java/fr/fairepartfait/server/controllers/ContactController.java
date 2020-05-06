package fr.fairepartfait.server.controllers;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import java.util.Properties;

@Path("/contact")
public class ContactRessource {
    @GET
    @Path("/query")
    public static void sendMessage(@Context UriInfo info) {
        String email = info.getQueryParameters().getFirst("email");
        String name = info.getQueryParameters().getFirst("name");
        String phone = info.getQueryParameters().getFirst("phone");
        String msg = info.getQueryParameters().getFirst("message");

        final String CONTACT = "faire-part-fait@outlook.fr";
        final String PASSWORD = "faire-part-dev59";
        
        try {
            String smtpHost = "SMTP.office365.com";
            String from = CONTACT;
            String to = CONTACT;
            
            Properties props = new Properties();
            props.put("mail.smtp.host", smtpHost);
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", 587);
            props.put("mail.smtp.socketFactory.port", 587);
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", smtpHost);
            
            Session session = Session.getDefaultInstance(props);
            session.setDebug(false);
            
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Faire-part-Fait: nouveau message");
            message.setText("Expéditeur : " + name + "\n\nTel : " + phone + "\n\nMail : " + email + "\n\nMessage : "+ text);
            
            Transport tr = session.getTransport("smtp");
            tr.connect(smtpHost, CONTACT, PASSWORD);
            message.saveChanges();
            
            tr.sendMessage(message, message.getAllRecipients());
            tr.close();
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}