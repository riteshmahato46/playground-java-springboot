package com.prototype.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@EnableCaching
public class PlaygroundApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = SpringApplication.run(PlaygroundApplication.class, args);
        System.out.println("Welcome to the playground");
    }
}
