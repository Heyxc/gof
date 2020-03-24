package com.shanhe.bridge.demo;

/**
 * @Package: com.shanhe.bridge.demo
 * @ClassName: CommonMessage
 * @Author: shanhe
 * @Description: 发送普通消息
 * @Date: 2020-03-20 16:19
 * @Version: 1.0
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor messageImplementor) {
        super.setMessageImplementor(messageImplementor);
    }

    public void sendMessage(String body, String address) {
        super.sendMessage(body, address);
    }
}
