package com.yllu.saltedge.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DummyController {


    @Value("${spring.datasource.url}")
    String jdbcURL;

    @GetMapping("/lol")
    public String showSomething() {
        return jdbcURL;
    }
}
