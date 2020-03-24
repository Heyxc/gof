package com.shanhe.adapterpattern.demo.simple;

/**
 * @Package: com.shanhe.adapterpattern.demo.simple
 * @ClassName: ChinaAC
 * @Author: shanhe
 * @Description: 中国输出电压
 * @Date: 2020-03-20 11:26
 * @Version: 1.0
 */
public class ChinaAC implements AC {
    private final static int output = 220;

    @Override
    public int output() {
        return output;
    }
}
