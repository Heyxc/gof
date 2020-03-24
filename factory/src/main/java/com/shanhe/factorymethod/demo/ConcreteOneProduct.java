package com.shanhe.factorymethod.demo;

/**
 * @Package: com.shanhe.factorymethod.demo
 * @ClassName: ConcreteOneProduct
 * @Author: shanhe
 * @Description: 具体产品
 * @Date: 2020-01-14 17:35
 * @Version: 1.0
 */
public class ConcreteOneProduct extends Product {
    @Override
    public void show() {
        System.out.println("展示了具体产品1");
    }
}
