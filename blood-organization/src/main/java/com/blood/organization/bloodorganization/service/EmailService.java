package com.blood.organization.bloodorganization.service;

import com.blood.organization.bloodorganization.entity.EmailDetailsClass;

public interface EmailService {
    void sendSimpleMail(EmailDetailsClass emailDetailsClass);
}
