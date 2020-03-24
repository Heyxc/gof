package com.shanhe.decorator.demo;

/**
 * @Package: com.shanhe.decorator.demo
 * @ClassName: ConcreteDecorator
 * @Author: shanhe
 * @Description: 具体装饰器
 * @Date: 2020-03-24 10:30
 * @Version: 1.0
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        add();
    }

    private void add() {
        System.out.println("add new operation!");
    }
}
