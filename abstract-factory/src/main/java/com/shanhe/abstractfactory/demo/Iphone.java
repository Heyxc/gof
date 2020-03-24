package com.shanhe.abstractfactory.demo;

/**
 * @Package: com.shanhe.abstractfactory.demo
 * @ClassName: Iphone
 * @Author: shanhe
 * @Description: 苹果手机类
 * @Date: 2020-03-19 11:57
 * @Version: 1.0
 */
public class Iphone implements Phone {
    @Override
    public Iphone create() {
        return this;
    }
}
