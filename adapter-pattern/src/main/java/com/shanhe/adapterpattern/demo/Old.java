package com.shanhe.adapterpattern.demo;

/**
 * @Package: com.shanhe.adapterpattern.demo
 * @ClassName: Old
 * @Author: shanhe
 * @Description: 历史实现
 * @Date: 2020-03-20 10:54
 * @Version: 1.0
 */
public class Old implements Target {
    @Override
    public void request() {
        System.out.println("target 的历史实现");
    }
}
