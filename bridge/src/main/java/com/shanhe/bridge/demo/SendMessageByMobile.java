package com.shanhe.bridge.demo;

/**
 * @Package: com.shanhe.bridge.demo
 * @ClassName: SendMessageByMobile
 * @Author: shanhe
 * @Description: 手机发送
 * @Date: 2020-03-20 16:16
 * @Version: 1.0
 */
public class SendMessageByMobile implements MessageImplementor {
    @Override
    public void send(String body, String address) {
        System.out.println("body :" + body + " to " + address);
    }
}
