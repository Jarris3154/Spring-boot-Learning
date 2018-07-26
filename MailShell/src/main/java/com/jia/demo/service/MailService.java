package com.jia.demo.service;

import org.springframework.mail.SimpleMailMessage;

public interface MailService {
    void sendEmail(SimpleMailMessage simpleMailMessage1);
}
