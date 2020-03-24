package com.shanhe.builderpattern.demo;

/**
 * @Package: com.shanhe.builderpattern.demo
 * @ClassName: LenovoBuilder
 * @Author: shanhe
 * @Description: 具体建造者
 * @Date: 2020-03-19 16:55
 * @Version: 1.0
 */
public class LenovoBuilder extends Builder {
    private Computer computer;

    public LenovoBuilder(String name) {
        computer = new Computer();
        computer.setName(name);
    }

    @Override
    LenovoBuilder buildCpu(int num) {
        computer.setCpu(num);
        return this;
    }

    @Override
    LenovoBuilder buildRam() {
        computer.setRam(12312231L);
        return this;
    }

    @Override
    LenovoBuilder buildDisk() {
        computer.setDisk(1222312L);
        return this;
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

    @Override
    public Computer append(String append) {
        computer.setName(computer.getName() + append);
        return null;
    }
}
