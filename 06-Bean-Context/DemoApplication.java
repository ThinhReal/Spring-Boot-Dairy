package com.thinh.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // Khởi tạo context (Cái kho chứa mọi Beans)
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        // 1. Lấy Bean thủ công từ context
        NotificationManager manager = context.getBean(NotificationManager.class);
        manager.show();

        // 2. Lấy Bean theo tên (Cẩn thận: ép kiểu nếu cần)
        MessageService manualSms = (MessageService) context.getBean("sms_bean");
        System.out.println("Manual retrieval: " + manualSms.getMessage());
    }
}