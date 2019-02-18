package com.xl.springclouddemoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringclouddemoserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclouddemoserverApplication.class, args);
    }

}

