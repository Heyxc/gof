package com.shanhe.observer.demo.pull;

/**
 * @Package: com.shanhe.observer.demo.pull
 * @ClassName: Observer
 * @Author: shanhe
 * @Description: 观察者接口
 * @Date: 2020-03-20 17:52
 * @Version: 1.0
 */
public interface Observer {
    void update(Subject subject);
}
