package com.shanhe.abstractfactory.demo;

/**
 * @Package: com.shanhe.abstractfactory.demo
 * @ClassName: AppleFactory
 * @Author: shanhe
 * @Description: 电脑制造工厂类
 * @Date: 2020-03-19 11:52
 * @Version: 1.0
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Computer getComputer() {
        return new Mac();
    }

    @Override
    public Phone getPhone() {
        return new Iphone();
    }
}
