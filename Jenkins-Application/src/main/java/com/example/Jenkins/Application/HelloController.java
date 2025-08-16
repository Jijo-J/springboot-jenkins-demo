package com.example.Jenkins.Application;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot with Jenkins 🚀";
    }



}
