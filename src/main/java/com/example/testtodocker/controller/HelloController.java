package com.example.testtodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Value("${test.env}")
//    private String name;

    @GetMapping("/hello")
    public String hello(){

        return "hasdfasgasdjflkasdfontoool";

    }
}