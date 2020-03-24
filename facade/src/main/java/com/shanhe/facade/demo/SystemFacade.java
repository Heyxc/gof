package com.shanhe.facade.demo;

/**
 * @Package: com.shanhe.facade.demo
 * @ClassName: SystemFacade
 * @Author: shanhe
 * @Description: 门面
 * @Date: 2020-03-23 13:41
 * @Version: 1.0
 */
public class SystemFacade {

    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public void test() {
        systemA = new SystemA();
        systemB = new SystemB();
        systemC = new SystemC();

        systemA.test();
        systemB.test();
        systemC.test();
    }
}
