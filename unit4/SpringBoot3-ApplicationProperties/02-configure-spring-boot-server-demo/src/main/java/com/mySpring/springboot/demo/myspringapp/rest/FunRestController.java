package com.mySpring.springboot.demo.myspringapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    // inject properties from application.properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // add new endpoint to use the properties
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
       return "Coach: " + coachName + ", Team name: " + teamName;
    }


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


}
