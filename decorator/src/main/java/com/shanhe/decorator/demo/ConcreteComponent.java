package com.shanhe.decorator.demo;

/**
 * @Package: com.shanhe.decorator.demo
 * @ClassName: ConcreteComponent
 * @Author: shanhe
 * @Description: 具体组件
 * @Date: 2020-03-24 10:27
 * @Version: 1.0
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("old operation!");
    }
}
