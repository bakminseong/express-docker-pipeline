package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot in Docker!";
    }

    @PostMapping("/hello")
    public String postHello(@RequestBody String name) {
        return "Hello, " + name + "!";
    }
}
