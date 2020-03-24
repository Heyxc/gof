package com.shanhe.adapterpattern.demo;

/**
 * @Package: com.shanhe.adapterpattern.demo
 * @ClassName: Adaptee
 * @Author: shanhe
 * @Description: 原有需要被适配的类
 * @Date: 2020-03-20 10:40
 * @Version: 1.0
 */
public class Adaptee {
    public void readyAdaptee() {
        System.out.println("需要被适配的方法");
    }
}
