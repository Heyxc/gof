package com.shanhe.abstractfactory.demo;

/**
 * @Package: com.shanhe.abstractfactory.demo
 * @ClassName: HuaWeiPhone
 * @Author: shanhe
 * @Description: 华为手机类
 * @Date: 2020-03-19 11:59
 * @Version: 1.0
 */
public class HuaWeiPhone implements Phone {
    @Override
    public HuaWeiPhone create() {
        return new HuaWeiPhone();
    }
}
