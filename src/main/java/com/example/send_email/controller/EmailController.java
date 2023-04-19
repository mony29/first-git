package com.example.send_email.controller;

import com.example.send_email.model.entity.Email;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmailController {
    @Autowired
    private JavaMailSender javaMailSender;
    @GetMapping("/test")
    public String formInput(Model model){
        Email email =new Email();
        Email senderName = new Email();
        model.addAttribute("email", email);
        model.addAttribute("senderName", senderName);
        return "form";
    }
    @GetMapping("/send")
    public String sendMail(HttpServletRequest request){
        String email = request.getParameter("email");
        String senderName = request.getParameter("senderName");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("message");
        mailMessage.setTo(email);
        String mailContent;
        String mailFrom;
        mailFrom = senderName;

    }
}
