package com.example.springmaven.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}/{surname}")
    public String Hello(@PathVariable String name, @PathVariable String surname){
        return "Hello " + name + " " + surname;
    }
}
