package com.shanhe.chainofresponsibility.demo;

/**
 * @Package: com.shanhe.chainofresponsibility.demo
 * @ClassName: ConcreteHandleB
 * @Author: shanhe
 * @Description: 具体处理类
 * @Date: 2020-03-24 14:17
 * @Version: 1.0
 */
public class ConcreteHandleB extends Handle {
    public ConcreteHandleB(String name) {
        super(name);
    }

    @Override
    public void requestHandle(String request) {
        if (request.equals("ConcreteHandleB")) {
            System.out.println("ConcreteHandleB handle");
        } else {
            this.successor.requestHandle(request);
        }
    }
}
