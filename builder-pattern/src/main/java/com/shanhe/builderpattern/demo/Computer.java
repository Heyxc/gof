package com.shanhe.builderpattern.demo;

import lombok.Data;

/**
 * @Package: com.shanhe.builderpattern.demo
 * @ClassName: Computer
 * @Author: shanhe
 * @Description: 被构造的对象
 * @Date: 2020-03-19 16:47
 * @Version: 1.0
 */
@Data
public class Computer {
    private int cpu;

    private long ram;

    private String name;

    private long disk;
}
