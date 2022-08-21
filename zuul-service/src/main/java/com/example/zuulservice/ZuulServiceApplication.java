package com.example.zuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulServiceApplication {

    //API Gateway
    //zuul deprecated since spring 2.4 because it does not support asynchronous
    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApplication.class, args);
    }

}
