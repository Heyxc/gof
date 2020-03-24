package com.shanhe.singleton.demo;

/**
 * @Package: com.shanhe.singleton.demo
 * @ClassName: HungrySingleton
 * @Author: shanhe
 * @Description: 饿加载单例实现
 * @Date: 2020-01-14 16:31
 * @Version: 1.0
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
