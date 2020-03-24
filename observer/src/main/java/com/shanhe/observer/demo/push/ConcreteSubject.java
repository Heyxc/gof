package com.shanhe.observer.demo.push;

/**
 * @Package: com.shanhe.observer.demo.push
 * @ClassName: ConcreteSubject
 * @Author: shanhe
 * @Description: 具体主题类 被观察者
 * @Date: 2020-03-20 17:04
 * @Version: 1.0
 */
public class ConcreteSubject extends Subject {
    private String state;

    public void changeState(String newState) {
        state = newState;
        System.out.println("now state is " + state);
        nodifyObservers(state);
    }
}
