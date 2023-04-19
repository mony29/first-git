package com.example.send_email.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Email {
    private String senderName;
    private String email;
    private String message;
    private String subject;
}
