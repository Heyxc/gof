package com.shanhe.observer.demo.pull;

/**
 * @Package: com.shanhe.observer.demo.pull
 * @ClassName: ConcreteSubject
 * @Author: shanhe
 * @Description: 具体被观察者
 * @Date: 2020-03-20 17:54
 * @Version: 1.0
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String state) {
        this.state = state;
        nodifyObservers();
    }
}
