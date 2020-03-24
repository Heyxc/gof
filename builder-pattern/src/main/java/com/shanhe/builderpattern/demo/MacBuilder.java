package com.shanhe.builderpattern.demo;

/**
 * @Package: com.shanhe.builderpattern.demo
 * @ClassName: MacBuilder
 * @Author: shanhe
 * @Description: 具体建造类
 * @Date: 2020-03-19 16:56
 * @Version: 1.0
 */
public class MacBuilder extends Builder {
    private Computer computer;

    public MacBuilder(String name) {
        computer = new Computer();
        computer.setName(name);
    }

    @Override
    MacBuilder buildCpu(int num) {
        computer.setCpu(num);
        return this;
    }

    @Override
    MacBuilder buildRam() {
        computer.setRam(123131L);
        return this;
    }

    @Override
    MacBuilder buildDisk() {
        computer.setDisk(12312L);
        return this;
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
