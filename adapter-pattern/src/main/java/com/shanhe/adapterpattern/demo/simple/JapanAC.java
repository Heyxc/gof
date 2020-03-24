package com.shanhe.adapterpattern.demo.simple;

/**
 * @Package: com.shanhe.adapterpattern.demo.simple
 * @ClassName: JapanAC
 * @Author: shanhe
 * @Description: 日本输出电压
 * @Date: 2020-03-20 11:27
 * @Version: 1.0
 */
public class JapanAC implements AC {
    private final static int output = 110;

    @Override
    public int output() {
        return output;
    }
}
