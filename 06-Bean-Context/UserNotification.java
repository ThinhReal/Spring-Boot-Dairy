package com.thinh.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// 1. Abstraction
interface MessageService {
    String getMessage();
}

// 2. Bean mặc định (Sẽ được chọn nếu không chỉ định gì thêm)
@Component
@Primary 
class EmailService implements MessageService {
    @Override
    public String getMessage() { return "Sending Email... (Priority)"; }
}

// 3. Bean phụ (Chỉ được chọn khi dùng @Qualifier)
@Component("sms_bean")
class SmsService implements MessageService {
    @Override
    public String getMessage() { return "Sending SMS..."; }
}