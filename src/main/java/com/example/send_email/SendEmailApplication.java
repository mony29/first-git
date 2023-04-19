package com.example.send_email;

import com.example.send_email.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendEmailApplication {

//    @Autowired
//    private EmailSenderService senderService;
    public static void main(String[] args) {
        SpringApplication.run(SendEmailApplication.class, args);
    }
//
//    @EventListener(ApplicationReadyEvent.class)
//    public void sendMail(){
//        senderService.sendEmail("keomony090999@gmail.com",
//                "This is subject",
//                "Ths is body of email");
//    }

}
