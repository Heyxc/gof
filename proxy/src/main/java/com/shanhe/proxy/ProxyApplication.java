package com.shanhe.proxy;

import com.shanhe.proxy.demo.ProxyObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyApplication.class, args);

        ProxyObject proxyObject = new ProxyObject();

        proxyObject.operation();
    }
}
