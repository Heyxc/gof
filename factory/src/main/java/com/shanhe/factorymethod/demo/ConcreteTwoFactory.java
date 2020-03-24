package com.shanhe.factorymethod.demo;

/**
 * @Package: com.shanhe.factorymethod.demo
 * @ClassName: ConcreteTwoFactory
 * @Author: shanhe
 * @Description: 具体工厂
 * @Date: 2020-01-14 17:33
 * @Version: 1.0
 */
public class ConcreteTwoFactory extends AbstractFactory {

    @Override
    public Product create() {
        return new ConcreteTwoProduct();
    }
}
