package com.mySpring.springboot.demo.myspringapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    // create "/" endpoint to return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on the server is: " + LocalDateTime.now();
    }
}
