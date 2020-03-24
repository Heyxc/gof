package com.shanhe.bridge.demo;

/**
 * @Package: com.shanhe.bridge.demo
 * @ClassName: UrgencyMessage
 * @Author: shanhe
 * @Description: 加急消息
 * @Date: 2020-03-20 16:20
 * @Version: 1.0
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(MessageImplementor messageImplementor) {
        super.setMessageImplementor(messageImplementor);
    }

    public void sendMessage(String body, String address) {
        super.sendMessage(body, address);
        watch();
    }

    private void watch() {
        System.out.println("加入监控");
    }
}
