package com.shanhe.builderpattern;

import com.shanhe.builderpattern.demo.Builder;
import com.shanhe.builderpattern.demo.ComputerDirector;
import com.shanhe.builderpattern.demo.LenovoBuilder;
import com.shanhe.builderpattern.demo.MacBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilderPatternApplication.class, args);

        ComputerDirector computerDirector = new ComputerDirector();

        Builder macBuilder = new MacBuilder("mac");
        computerDirector.makeComputer(macBuilder);
        System.out.println(macBuilder.getComputer());

        Builder lenBuilder = new LenovoBuilder("lenovo");
        computerDirector.makeComputer(lenBuilder);
        lenBuilder.append("xxxx");
        System.out.println(lenBuilder.getComputer());

    }

}
