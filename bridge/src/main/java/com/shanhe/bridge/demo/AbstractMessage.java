package com.shanhe.bridge.demo;

/**
 * @Package: com.shanhe.bridge.demo
 * @ClassName: AbstractMessage
 * @Author: shanhe
 * @Description: 外部构造的抽象类
 * @Date: 2020-03-20 16:13
 * @Version: 1.0
 */
public abstract class AbstractMessage {

    private MessageImplementor messageImplementor;

    public void setMessageImplementor(MessageImplementor messageImplementor) {
        this.messageImplementor = messageImplementor;
    }

    public void sendMessage(String body, String address) {
        this.messageImplementor.send(body, address);
    }
}
