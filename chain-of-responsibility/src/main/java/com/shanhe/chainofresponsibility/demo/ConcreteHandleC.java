package com.shanhe.chainofresponsibility.demo;

/**
 * @Package: com.shanhe.chainofresponsibility.demo
 * @ClassName: ConcreteHandleC
 * @Author: shanhe
 * @Description: 具体处理类
 * @Date: 2020-03-24 14:22
 * @Version: 1.0
 */
public class ConcreteHandleC extends Handle {
    public ConcreteHandleC(String name) {
        super(name);
    }

    @Override
    public void requestHandle(String request) {
        if (request.equals("ConcreteHandleC")) {
            System.out.println("ConcreteHandleC handle");
        } else {
            this.successor.requestHandle(request);
        }
    }
}
