package com.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
public class HelloController {

    @GetMapping
    public String sayhello(){
        return "Swagger Hello world";
    }

}
