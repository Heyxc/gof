package com.shanhe.observer.demo.push;

/**
 * @Package: com.shanhe.observer.demo.push
 * @ClassName: ConcreteObserver
 * @Author: shanhe
 * @Description: 具体观察者
 * @Date: 2020-03-20 17:07
 * @Version: 1.0
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(String state) {
        System.out.println("change state to " + state);
    }
}
