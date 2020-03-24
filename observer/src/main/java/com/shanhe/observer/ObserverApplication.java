package com.shanhe.observer;

import com.shanhe.observer.demo.pull.ConcreteObserver;
import com.shanhe.observer.demo.pull.ConcreteSubject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObserverApplication.class, args);


//        ConcreteSubject concreteSubject = new ConcreteSubject();
//        concreteSubject.attach(new ConcreteObserver());
//        concreteSubject.changeState("new state");

        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(new ConcreteObserver());
        concreteSubject.change("new state");
    }
}
