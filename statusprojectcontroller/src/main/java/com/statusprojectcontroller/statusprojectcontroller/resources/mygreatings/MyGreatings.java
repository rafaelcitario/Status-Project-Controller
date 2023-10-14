package com.statusprojectcontroller.statusprojectcontroller.resources.mygreatings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/hello")
public class MyGreatings {

    @GetMapping
    public String hello() {
        return "Hello world Spring Boot";
    }
}
