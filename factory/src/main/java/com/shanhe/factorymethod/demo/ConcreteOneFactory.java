package com.shanhe.factorymethod.demo;

/**
 * @Package: com.shanhe.factorymethod.demo
 * @ClassName: ConcreteOneFactory
 * @Author: shanhe
 * @Description: 具体工厂
 * @Date: 2020-01-14 17:32
 * @Version: 1.0
 */
public class ConcreteOneFactory extends AbstractFactory {

    @Override
    public Product create() {
        return new ConcreteOneProduct();
    }
}
