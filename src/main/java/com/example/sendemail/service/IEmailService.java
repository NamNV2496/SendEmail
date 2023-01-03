package com.example.sendemail.service;

import com.example.sendemail.domain.EmailDetails;

public interface IEmailService {
    String  sendEmail(EmailDetails emailDetails);
    String  sendEmailAttachment(EmailDetails emailDetails);

}
