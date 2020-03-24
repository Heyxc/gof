package com.shanhe.observer.demo.pull;

/**
 * @Package: com.shanhe.observer.demo.pull
 * @ClassName: ConcreteObserver
 * @Author: shanhe
 * @Description: 具体观察者
 * @Date: 2020-03-20 17:52
 * @Version: 1.0
 */
public class ConcreteObserver implements Observer {
    private String state;

    @Override
    public void update(Subject subject) {
        state = ((ConcreteSubject) subject).getState();
        System.out.println("observer state is " + state);
    }
}
