package com.shanhe.observer.demo.push;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: com.shanhe.observer.demo.push
 * @ClassName: Subject
 * @Author: shanhe
 * @Description: 主题类 被观察者
 * @Date: 2020-03-20 17:03
 * @Version: 1.0
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    void nodifyObservers(String state) {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
