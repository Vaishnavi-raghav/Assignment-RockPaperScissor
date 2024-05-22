package com.RockPaperScissor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.RockPaperScissor", "com.RockPaperScissor.config"})
public class RockPaperScissorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RockPaperScissorsApplication.class, args);
    }
}
//http://localhost:8080/play?move=ROCK
//http://localhost:8080/swagger-ui.html
