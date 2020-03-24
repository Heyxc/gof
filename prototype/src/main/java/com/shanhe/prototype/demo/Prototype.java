package com.shanhe.prototype.demo;

/**
 * @Package: com.shanhe.prototype.demo
 * @ClassName: Prototype
 * @Author: shanhe
 * @Description: 原型模式实现  clone
 * @Date: 2020-01-14 16:47
 * @Version: 1.0
 */
public class Prototype implements Cloneable {

    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
