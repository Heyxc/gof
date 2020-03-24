package com.shanhe.abstractfactory;

import com.shanhe.abstractfactory.demo.AbstractFactory;
import com.shanhe.abstractfactory.demo.Computer;
import com.shanhe.abstractfactory.demo.FactoryProducer;
import com.shanhe.abstractfactory.demo.Phone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbstractFactoryApplication.class, args);

        AbstractFactory appleFactory = FactoryProducer.getFactory("apple");
        Computer mac = appleFactory.getComputer().create();
        System.out.println(mac);
        Phone iphone = appleFactory.getPhone().create();
        System.out.println(iphone);

        AbstractFactory huaWeiFactory = FactoryProducer.getFactory("huaWei");
        Computer huaWeiPC = huaWeiFactory.getComputer().create();
        System.out.println(huaWeiPC);
        Phone huaWeiPhone = huaWeiFactory.getPhone().create();
        System.out.println(huaWeiPhone);
    }

}
