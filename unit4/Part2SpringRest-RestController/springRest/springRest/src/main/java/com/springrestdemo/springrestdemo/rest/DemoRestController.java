package com.springrestdemo.springrestdemo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class DemoRestController {

    @RequestMapping("/")
    public String getIndexPage() { return "index"; }

    // add code for the "/hello" endpoint
    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello World! I Changed the message!";
    }

}
