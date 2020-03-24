package com.shanhe.abstractfactory.demo;

/**
 * @Package: com.shanhe.abstractfactory.demo
 * @ClassName: FactoryProducer
 * @Author: shanhe
 * @Description: 创建工厂类
 * @Date: 2020-03-19 13:48
 * @Version: 1.0
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        factory = factory.toUpperCase();
        switch (factory) {
            case "APPLE":
                return new AppleFactory();
            case "HUAWEI":
                return new HuaWeiFactory();
            default:
        }
        return null;
    }
}
