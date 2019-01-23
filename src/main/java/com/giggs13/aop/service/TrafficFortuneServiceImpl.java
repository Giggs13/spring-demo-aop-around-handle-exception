package com.giggs13.aop.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TrafficFortuneServiceImpl
        implements TrafficFortuneService {

    @Override
    public String getFortune(boolean tripWire) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (tripWire) {
            throw new RuntimeException("Major accident! Highway is closed.");
        }

        return "Expect heavy traffic this morning";
    }
}
