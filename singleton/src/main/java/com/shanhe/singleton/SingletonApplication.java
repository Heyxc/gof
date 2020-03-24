package com.shanhe.singleton;

import com.shanhe.singleton.demo.HungrySingleton;
import com.shanhe.singleton.demo.LazySingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingletonApplication.class, args);
        test();
    }

    private static void test() {
        System.out.println("---------------1--------------");
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
        System.out.println("---------------2--------------");
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
    }

}
