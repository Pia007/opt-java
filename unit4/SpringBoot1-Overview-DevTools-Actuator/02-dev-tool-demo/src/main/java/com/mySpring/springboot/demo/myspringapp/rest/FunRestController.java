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

    // expose new endpoints to test dev-tool auto reload and auto-rerun
    @GetMapping("/study")
    public String getDailyStudy() {
        return "Study Java every day!";
    }

    @GetMapping("automatic")
    public String getBuildAuto() {
        return "Build automatically";
    }

    @GetMapping("best")
    public String getBest() {
        return "Build oh yeah!";
    }
}
