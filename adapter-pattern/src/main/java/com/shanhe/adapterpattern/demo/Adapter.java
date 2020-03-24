package com.shanhe.adapterpattern.demo;

/**
 * @Package: com.shanhe.adapterpattern.demo
 * @ClassName: Adapter
 * @Author: shanhe
 * @Description: 适配者类
 * @Date: 2020-03-20 10:52
 * @Version: 1.0
 */
public class Adapter extends Adaptee implements Target {

    //如果target为对象 则Adaptee作为Adapter的属性去适配
    //Adaptee也可以被传递进来
//    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        System.out.println("target 适配adaptee 后的实现");
        super.readyAdaptee();
    }
}
