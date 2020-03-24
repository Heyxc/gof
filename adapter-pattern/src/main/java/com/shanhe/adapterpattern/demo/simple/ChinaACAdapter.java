package com.shanhe.adapterpattern.demo.simple;

/**
 * @Package: com.shanhe.adapterpattern.demo.simple
 * @ClassName: ChinaACAdapter
 * @Author: shanhe
 * @Description: 中国标准电压适配手机
 * @Date: 2020-03-20 11:55
 * @Version: 1.0
 */
public class ChinaACAdapter extends PhoneAC implements ACAdapter {

    private final static int vo = 220;

    @Override
    public void toPhoneAC(AC ac) {
        int acNum = ac.output();
        System.out.println("ChinaACAdapter toPhoneAC :" + acNum / 44);
        super.inputAC();
    }

    @Override
    public boolean support(AC ac) {
        return ac.output() == vo;
    }
}
