package com.shanhe.bridge.demo;

/**
 * @Package: com.shanhe.bridge.demo
 * @ClassName: MessageImplementor
 * @Author: shanhe
 * @Description: 统一发送消息接口
 * @Date: 2020-03-20 16:15
 * @Version: 1.0
 */
public interface MessageImplementor {

    void send(String body, String address);
}
