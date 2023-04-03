package com.example.springmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringMavenApplication {
    public static void main(String[] args) {
        System.out.println("YEEEESSS");
        SpringApplication.run(SpringMavenApplication.class, args);
    }

}
