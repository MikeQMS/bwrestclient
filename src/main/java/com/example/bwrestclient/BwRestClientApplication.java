package com.example.bwrestclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan(basePackages={"com.example"})
public class BwRestClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BwRestClientApplication.class, args);
    }

}
