package com.rahul.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootAppApplication.class, args);

        Alien alien = context.getBean(Alien.class);

        Alien alien2 = context.getBean(Alien.class);
    }

}
