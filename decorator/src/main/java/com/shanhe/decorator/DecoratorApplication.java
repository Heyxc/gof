package com.shanhe.decorator;

import com.shanhe.decorator.demo.Component;
import com.shanhe.decorator.demo.ConcreteComponent;
import com.shanhe.decorator.demo.ConcreteDecorator;
import com.shanhe.decorator.demo.Decorator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoratorApplication.class, args);

        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
