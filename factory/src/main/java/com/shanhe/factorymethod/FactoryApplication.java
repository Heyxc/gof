package com.shanhe.factorymethod;

import com.shanhe.factorymethod.demo.ConcreteOneFactory;
import com.shanhe.factorymethod.demo.ConcreteTwoFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryApplication.class, args);

        ConcreteOneFactory concreteOneFactory = new ConcreteOneFactory();
        concreteOneFactory.create().show();

        ConcreteTwoFactory concreteTwoFactory = new ConcreteTwoFactory();
        concreteTwoFactory.create().show();
    }

}
