package com.shanhe.abstractfactory.demo;

/**
 * @Package: com.shanhe.abstractfactory.demo
 * @ClassName: AbstractFactory
 * @Author: shanhe
 * @Description: 抽象工厂
 * @Date: 2020-03-19 12:00
 * @Version: 1.0
 */
public interface AbstractFactory {
    Computer getComputer();

    Phone getPhone();
}
