package com.shanhe.proxy.demo;

/**
 * @Package: com.shanhe.proxy.demo
 * @ClassName: ProxyObject
 * @Author: shanhe
 * @Description: 代理对象
 * @Date: 2020-03-23 17:33
 * @Version: 1.0
 */
public class ProxyObject extends AbstractObject {

    private static RealObject realObject = new RealObject();

    @Override
    public void operation() {
        realObject.operation();
    }
}
