package com.kiran.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//This will scan all the packages while starting our application
//This will look into all classes for @controller @Services etc.. annotations.
@ComponentScan(basePackages="com.kiran")
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
