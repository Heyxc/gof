package com.shanhe.facade;

import com.shanhe.facade.demo.SystemFacade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacadeApplication.class, args);

        SystemFacade systemFacade = new SystemFacade();

        systemFacade.test();
    }

}
