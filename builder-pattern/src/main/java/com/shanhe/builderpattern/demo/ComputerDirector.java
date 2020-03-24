package com.shanhe.builderpattern.demo;

/**
 * @Package: com.shanhe.builderpattern.demo
 * @ClassName: ComputerDirector
 * @Author: shanhe
 * @Description: 构建指挥者
 * @Date: 2020-03-19 16:57
 * @Version: 1.0
 */
public class ComputerDirector {
    public void makeComputer(Builder builder) {
        builder.buildDisk().buildCpu(1).buildRam();
    }
}
