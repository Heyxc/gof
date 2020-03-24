package com.shanhe.template.demo;

/**
 * @Package: com.shanhe.template.demo
 * @ClassName: Account
 * @Author: shanhe
 * @Description: 账户抽象类
 * @Date: 2020-03-23 16:03
 * @Version: 1.0
 */
public abstract class Account {

    public final double getBalance() {
        String type = this.doAccountType();
        double rate = doAccountRate(type);
        return calculateAccount(type) * rate;
    }

    protected abstract double doAccountRate(String type);

    protected abstract String doAccountType();

    private double calculateAccount(String type) {

        return 0.01;
    }
}
