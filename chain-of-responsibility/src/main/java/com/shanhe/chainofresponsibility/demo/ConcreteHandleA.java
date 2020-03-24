package com.shanhe.chainofresponsibility.demo;

/**
 * @Package: com.shanhe.chainofresponsibility.demo
 * @ClassName: ConcreteHandleA
 * @Author: shanhe
 * @Description: 具体处理类
 * @Date: 2020-03-24 14:09
 * @Version: 1.0
 */
public class ConcreteHandleA extends Handle {

    public ConcreteHandleA(String name) {
        super(name);
    }

    @Override
    public void requestHandle(String request) {
        if (request.equals("ConcreteHandleA")) {
            System.out.println("ConcreteHandleA handle");
        } else {
            this.successor.requestHandle(request);
        }
    }
}
