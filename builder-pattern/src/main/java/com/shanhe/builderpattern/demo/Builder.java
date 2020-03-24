package com.shanhe.builderpattern.demo;

/**
 * @Package: com.shanhe.builderpattern.demo
 * @ClassName: Builder
 * @Author: shanhe
 * @Description: 建造类
 * @Date: 2020-03-19 16:51
 * @Version: 1.0
 */
public abstract class Builder {

    abstract Builder buildCpu(int num);

    abstract Builder buildRam();

    abstract Builder buildDisk();

    public abstract Computer getComputer();

    public Computer append(String append) {
        return null;
    }

    ;
}
