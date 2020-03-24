package com.shanhe.adapterpattern;

import com.shanhe.adapterpattern.demo.simple.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AdapterPatternApplication {


    public static void main(String[] args) {
        SpringApplication.run(AdapterPatternApplication.class, args);

//        Old old = new Old();
//        old.request();
//
//        Adapter adapter = new Adapter();
//        adapter.request();

        ChinaAC chinaAC = new ChinaAC();

        getACAdapter(chinaAC).toPhoneAC(chinaAC);

        JapanAC japanAC = new JapanAC();

        getACAdapter(japanAC).toPhoneAC(japanAC);


    }

    private static ACAdapter getACAdapter(AC ac) {
        List<ACAdapter> acAdapters = new ArrayList<>();
        acAdapters.add(new ChinaACAdapter());
        acAdapters.add(new JapanACAdapter());

        ACAdapter acAdapter = null;

        for (ACAdapter adapter : acAdapters) {
            if (adapter.support(ac)) {
                acAdapter = adapter;
                break;
            }
        }

        return acAdapter;
    }
}
