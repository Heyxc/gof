package com.shanhe.proxy.demo;

/**
 * @Package: com.shanhe.proxy.demo
 * @ClassName: RealObject
 * @Author: shanhe
 * @Description: 真实对象
 * @Date: 2020-03-23 17:32
 * @Version: 1.0
 */
public class RealObject extends AbstractObject {
    @Override
    public void operation() {
        System.out.println("真实对象执行的操作");
    }
}
