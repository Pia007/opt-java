package com.springrestdemo.springrestdemo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoRestController {

    @RequestMapping("/")
    public String getIndexPage() { return "index.html"; }

    // add code for the "/hello" endpoint
    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello World! I Changed the message!";
    }

}
