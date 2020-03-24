package com.shanhe.abstractfactory.demo;

/**
 * @Package: com.shanhe.abstractfactory.demo
 * @ClassName: HuaWeiFactory
 * @Author: shanhe
 * @Description: 手机制造工厂类
 * @Date: 2020-03-19 11:52
 * @Version: 1.0
 */
public class HuaWeiFactory implements AbstractFactory {
    @Override
    public Computer getComputer() {
        return new HuaWeiPC();
    }

    @Override
    public Phone getPhone() {
        return new HuaWeiPhone();
    }
}
