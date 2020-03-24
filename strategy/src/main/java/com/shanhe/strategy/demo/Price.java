package com.shanhe.strategy.demo;

/**
 * @Package: com.shanhe.strategy.demo
 * @ClassName: Price
 * @Author: shanhe
 * @Description: 价格类
 * @Date: 2020-03-23 14:13
 * @Version: 1.0
 */
public class Price {

    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    public double getPrice(double basePrice) {
        return memberStrategy.getPrice(basePrice);
    }
}
