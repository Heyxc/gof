package com.shanhe.abstractfactory.demo;

/**
 * @Package: com.shanhe.abstractfactory.demo
 * @ClassName: Mac
 * @Author: shanhe
 * @Description: mac电脑类
 * @Date: 2020-03-19 11:54
 * @Version: 1.0
 */
public class Mac implements Computer {
    @Override
    public Mac create() {
        return this;
    }
}
