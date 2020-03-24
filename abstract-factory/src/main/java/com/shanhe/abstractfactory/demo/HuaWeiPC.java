package com.shanhe.abstractfactory.demo;

/**
 * @Package: com.shanhe.abstractfactory.demo
 * @ClassName: HuaWeiPC
 * @Author: shanhe
 * @Description: 联想电脑类
 * @Date: 2020-03-19 11:56
 * @Version: 1.0
 */
public class HuaWeiPC implements Computer {
    @Override
    public HuaWeiPC create() {
        return this;
    }
}
