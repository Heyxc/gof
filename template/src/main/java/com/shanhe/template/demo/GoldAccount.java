package com.shanhe.template.demo;

/**
 * @Package: com.shanhe.template.demo
 * @ClassName: GoldAccount
 * @Author: shanhe
 * @Description: 金卡账户计算逻辑类
 * @Date: 2020-03-23 16:06
 * @Version: 1.0
 */
public class GoldAccount extends Account {
    @Override
    protected double doAccountRate(String type) {
        return 0;
    }

    @Override
    protected String doAccountType() {
        return null;
    }
}
