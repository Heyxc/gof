package com.shanhe.strategy.demo;

/**
 * @Package: com.shanhe.strategy.demo
 * @ClassName: GoldMemberStrategy
 * @Author: shanhe
 * @Description: 金卡用户计价策略
 * @Date: 2020-03-23 14:10
 * @Version: 1.0
 */
public class GoldMemberStrategy implements MemberStrategy {
    @Override
    public double getPrice(double basePrice) {
        return basePrice * 0.6;
    }
}
