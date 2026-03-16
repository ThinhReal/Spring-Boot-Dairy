package com.thinh.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {

    private MessageService constructorService;
    private MessageService setterService;

    // A. Injection qua Constructor (Khuyên dùng)
    // Spring thấy @Primary ở EmailService nên sẽ tự động chọn nó
    @Autowired
    public NotificationManager(MessageService messageService) {
        this.constructorService = messageService;
    }

    // B. Injection qua Setter + Dùng @Qualifier để ghi đè @Primary
    // Ở đây ta ép Spring phải lấy SmsService (đã đặt tên là sms_bean ở File 1)
    @Autowired
    @Qualifier("sms_bean")
    public void setSetterService(MessageService messageService) {
        this.setterService = messageService;
    }

    public void show() {
        System.out.println("Constructor (Primary): " + constructorService.getMessage());
        System.out.println("Setter (Qualifier): " + setterService.getMessage());
    }
}