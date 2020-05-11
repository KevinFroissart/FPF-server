package fr.fairepartfait.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@Component
public class ContactController {
  
    @Autowired
    public JavaMailSender emailSender;
 
    @GetMapping("/api/contact/query")
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