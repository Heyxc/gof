package com.shanhe.decorator.demo;

/**
 * @Package: com.shanhe.decorator.demo
 * @ClassName: Decorator
 * @Author: shanhe
 * @Description: 装饰器
 * @Date: 2020-03-24 10:28
 * @Version: 1.0
 */
public abstract class Decorator {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
