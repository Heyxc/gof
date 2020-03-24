package com.shanhe.template;

import com.shanhe.template.demo.GoldAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);

        GoldAccount goldAccount = new GoldAccount();
        goldAccount.getBalance();
    }
}
