package com.blood.organization.bloodorganization.entity;

public class EmailDetailsClass {
    private String recipient;
    private String mailSender;

    public EmailDetailsClass() {
    }

    public EmailDetailsClass(String recipient, String mailSender) {
        this.recipient = recipient;
        this.mailSender = mailSender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMailSender() {
        return mailSender;
    }

    public void setMailSender(String mailSender) {
        this.mailSender = mailSender;
    }
}
