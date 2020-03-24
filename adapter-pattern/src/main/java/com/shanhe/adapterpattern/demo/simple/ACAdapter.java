package com.shanhe.adapterpattern.demo.simple;

/**
 * @Package: com.shanhe.adapterpattern.demo.simple
 * @ClassName: ACAdapter
 * @Author: shanhe
 * @Description: 标准电压适配手机电压接口
 * @Date: 2020-03-20 11:33
 * @Version: 1.0
 */
public interface ACAdapter {

    void toPhoneAC(AC ac);

    boolean support(AC ac);

}
