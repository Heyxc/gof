package com.shanhe.template.demo;

/**
 * @Package: com.shanhe.template.demo
 * @ClassName: SilverAccount
 * @Author: shanhe
 * @Description: 银卡账户
 * @Date: 2020-03-23 16:07
 * @Version: 1.0
 */
public class SilverAccount extends Account{
    @Override
    protected double doAccountRate(String type) {
        return 0;
    }

    @Override
    protected String doAccountType() {
        return null;
    }
}
