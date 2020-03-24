package com.shanhe.chainofresponsibility;

import com.shanhe.chainofresponsibility.demo.ConcreteHandleA;
import com.shanhe.chainofresponsibility.demo.ConcreteHandleB;
import com.shanhe.chainofresponsibility.demo.ConcreteHandleC;
import com.shanhe.chainofresponsibility.demo.Handle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainOfResponsibilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChainOfResponsibilityApplication.class, args);


        Handle concreteHandleA = new ConcreteHandleA("ConcreteHandleA");
        Handle concreteHandleB = new ConcreteHandleB("concreteHandleB");
        Handle concreteHandleC = new ConcreteHandleC("concreteHandleC");

        concreteHandleA.setSuccessor(concreteHandleB);
        concreteHandleB.setSuccessor(concreteHandleC);


        concreteHandleA.requestHandle("ConcreteHandleB");
        concreteHandleB.requestHandle("ConcreteHandleC");
    }
}
