package com.shanhe.strategy.demo;

/**
 * @Package: com.shanhe.strategy.demo
 * @ClassName: SilverMemberStrategy
 * @Author: shanhe
 * @Description: 银卡用户计价策略
 * @Date: 2020-03-23 14:11
 * @Version: 1.0
 */
public class SilverMemberStrategy implements MemberStrategy {
    @Override
    public double getPrice(double basePrice) {
        return basePrice * 0.8;
    }
}
