package com.shanhe.chainofresponsibility.demo;

/**
 * @Package: com.shanhe.chainofresponsibility.demo
 * @ClassName: Handle
 * @Author: shanhe
 * @Description: 抽象句柄类
 * @Date: 2020-03-24 14:03
 * @Version: 1.0
 */
public abstract class Handle {
    protected Handle successor;
    protected String name;

    public Handle(String name) {
        this.name = name;
    }

    public void setSuccessor(Handle successor) {
        this.successor = successor;
    }

    public abstract void requestHandle(String request);
}
