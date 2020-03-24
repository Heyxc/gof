package com.shanhe.observer.demo.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: com.shanhe.observer.demo.pull
 * @ClassName: Subject
 * @Author: shanhe
 * @Description: 被观察者抽象类
 * @Date: 2020-03-20 17:47
 * @Version: 1.0
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    void remove(Observer observer) {
        observers.remove(observer);
    }

    void nodifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }
}
