package com.shanhe.factorymethod.demo;

/**
 * @Package: com.shanhe.factorymethod.demo
 * @ClassName: ConcreteTwoProduct
 * @Author: shanhe
 * @Description: 具体产品2
 * @Date: 2020-01-14 17:36
 * @Version: 1.0
 */
public class ConcreteTwoProduct extends Product {
    @Override
    public void show() {
        System.out.println("展示了具体产品2");
    }
}
