package com.giggs13.aop;

import com.giggs13.aop.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class AroundHandlingExceptionDemoApp {

    private static final Logger logger = Logger.getLogger(AroundHandlingExceptionDemoApp.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService trafficFortuneService = context.getBean(TrafficFortuneService.class);

        boolean tripWire = true;
        String data = trafficFortuneService.getFortune(tripWire);
        logger.info("\nMy fortune is: " + data);

        logger.info("\nMain Program is finished");

        context.close();
    }
}
