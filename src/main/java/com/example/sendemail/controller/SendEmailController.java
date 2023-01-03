package com.example.sendemail.controller;

import com.example.sendemail.domain.EmailDetails;
import com.example.sendemail.service.IEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SendEmailController {
    private final IEmailService emailService;

    @GetMapping("/send")
    public String sendEmail(@RequestBody EmailDetails details) {
        return emailService.sendEmail(details);
    }
}
