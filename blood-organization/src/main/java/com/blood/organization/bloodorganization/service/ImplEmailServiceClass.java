package com.blood.organization.bloodorganization.service;

import com.blood.organization.bloodorganization.entity.EmailDetailsClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ImplEmailServiceClass implements EmailService{

    @Autowired
    private JavaMailSender javaMailSender;

    private String subject="Complete 4 month";
    private String message="You complete 4 month after donate blood. Now you can again donate blood";

    @Override
    public void sendSimpleMail(EmailDetailsClass emailDetailsClass) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(emailDetailsClass.getMailSender());
        simpleMailMessage.setText(emailDetailsClass.getRecipient());
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);
        javaMailSender.send(simpleMailMessage);
    }
}
