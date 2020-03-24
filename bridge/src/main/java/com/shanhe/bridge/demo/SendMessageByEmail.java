package com.shanhe.bridge.demo;

/**
 * @Package: com.shanhe.bridge.demo
 * @ClassName: SendMessageByEmail
 * @Author: shanhe
 * @Description: email发送
 * @Date: 2020-03-20 16:17
 * @Version: 1.0
 */
public class SendMessageByEmail implements MessageImplementor {
    @Override
    public void send(String body, String address) {
        System.out.println("body :" + body + " to " + address);
    }
}
