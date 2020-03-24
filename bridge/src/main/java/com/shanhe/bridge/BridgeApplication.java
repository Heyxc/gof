package com.shanhe.bridge;

import com.shanhe.bridge.demo.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BridgeApplication.class, args);

        MessageImplementor sendMessageByEmail = new SendMessageByEmail();
        CommonMessage commonMessage = new CommonMessage(sendMessageByEmail);
        commonMessage.sendMessage("fuck", "you");

        MessageImplementor sendMessageByMobile = new SendMessageByMobile();
        UrgencyMessage urgencyMessage = new UrgencyMessage(sendMessageByMobile);
        urgencyMessage.sendMessage("he~", "you");
    }
}
