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

@Component
public class ContactController implements EmailService {
  
    @Autowired
    public JavaMailSender emailSender;
 
    @GetMapping("contact/query")
    public void messageProcess(@RequestParam String name, @RequestParam String email, @RequestParam String phone, @RequestParam String message) {
    	sendSimpleMessage(name, email, phone, message);
    }
    
    public void sendSimpleMessage(String name, String email, String phone, String text) {
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setTo("faire-part-fait@outlook.fr"); 
        message.setSubject("Faire-part-Fait: nouveau message"); 
        message.setText("Nom: " + name  + "\nMail: " + email + "\nTel: " + phone + "\n\nMessage: " + text);
        emailSender.send(message);
    }
}