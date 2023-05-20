package com.eye.organization.eyeorganization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailServiceClass {
    @Autowired
    private JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String senderEmail;

    public void sendMail(String mail, String varCode){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(senderEmail);
        simpleMailMessage.setTo(mail);
        simpleMailMessage.setSubject("Valification code");
        simpleMailMessage.setText(varCode);
        javaMailSender.send(simpleMailMessage);
    }
}
