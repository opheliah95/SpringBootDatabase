package com.github.opheliah95;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Welcome %s!", name);
    }

    @GetMapping("/")
    public String index() {
        return String.format("Welcome to our database service");
    }
}
