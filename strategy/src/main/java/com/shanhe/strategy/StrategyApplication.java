package com.shanhe.strategy;

import com.shanhe.strategy.demo.GoldMemberStrategy;
import com.shanhe.strategy.demo.Price;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategyApplication.class, args);

        GoldMemberStrategy goldMemberStrategy = new GoldMemberStrategy();

        Price price = new Price(goldMemberStrategy);

        double p = price.getPrice(100);

        System.out.println(p);
    }
}
