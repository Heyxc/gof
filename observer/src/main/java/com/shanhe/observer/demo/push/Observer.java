package com.shanhe.observer.demo.push;

/**
 * @Package: com.shanhe.observer.demo.push
 * @ClassName: Observer
 * @Author: shanhe
 * @Description: 观察者接口
 * @Date: 2020-03-20 17:05
 * @Version: 1.0
 */
public interface Observer {
    void update(String state);
}
