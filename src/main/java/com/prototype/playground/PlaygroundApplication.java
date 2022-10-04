package com.prototype.playground;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import com.prototype.playground.model.User;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PlaygroundApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = SpringApplication.run(PlaygroundApplication.class, args);
        // Test code to be removed later
        User usr = appContext.getBean(User.class);
        usr.printDetails();
        System.out.println("Welcome to the playground");
    }

}
