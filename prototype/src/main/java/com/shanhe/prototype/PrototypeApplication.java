package com.shanhe.prototype;

import com.shanhe.prototype.demo.Prototype;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrototypeApplication.class, args);
        test();
    }

    private static void test() {
        Prototype prototype = new Prototype();
        System.out.println(prototype);
        try {
            Prototype c1 = prototype.clone();
            System.out.println(c1);
        } catch (Exception e) {

        }
    }
}
