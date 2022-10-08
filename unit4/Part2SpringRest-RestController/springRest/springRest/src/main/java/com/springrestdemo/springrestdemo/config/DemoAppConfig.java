package com.springrestdemo.springrestdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// Step 2
@Configuration
@EnableWebMvc
@ComponentScan("com.springrestdemo.springrestdemo")
public class DemoAppConfig {
}
