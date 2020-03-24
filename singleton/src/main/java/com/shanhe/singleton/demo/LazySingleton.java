package com.shanhe.singleton.demo;

import java.util.Objects;

/**
 * @Package: com.shanhe.singleton.demo
 * @ClassName: LazySingleton
 * @Author: shanhe
 * @Description: 懒加载单例实现  线程安全
 * @Date: 2020-01-14 16:23
 * @Version: 1.0
 */
public class LazySingleton {
    private static volatile LazySingleton lazySingleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (Objects.isNull(lazySingleton)) {
            synchronized (LazySingleton.class) {
                if (Objects.isNull(lazySingleton)) {
                    lazySingleton = new LazySingleton();
                }
            }
        }

        return lazySingleton;
    }
}
