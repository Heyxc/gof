package com.shanhe.strategy.demo;

/**
 * @Package: com.shanhe.strategy.demo
 * @ClassName: MemberStrategy
 * @Author: shanhe
 * @Description: 计价策略
 * @Date: 2020-03-23 14:07
 * @Version: 1.0
 */
public interface MemberStrategy {
    double getPrice(double basePrice);
}
