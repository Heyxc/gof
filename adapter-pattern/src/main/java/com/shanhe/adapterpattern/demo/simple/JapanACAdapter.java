package com.shanhe.adapterpattern.demo.simple;

/**
 * @Package: com.shanhe.adapterpattern.demo.simple
 * @ClassName: JapanACAdapter
 * @Author: shanhe
 * @Description: 日本标准电压适配手机
 * @Date: 2020-03-20 11:38
 * @Version: 1.0
 */
public class JapanACAdapter extends PhoneAC implements ACAdapter {
    private final static int vo = 110;

    @Override
    public void toPhoneAC(AC ac) {
        int acNum = ac.output();

        System.out.println("JapanACAdapter toPhoneAC :" + acNum / 22);
        super.inputAC();
    }

    @Override
    public boolean support(AC ac) {
        return ac.output() == vo;
    }

}
