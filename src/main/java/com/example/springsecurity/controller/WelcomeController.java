package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    @GetMapping
    public String welcome(){
        return "Thanks for visiting this application";
    }

    @GetMapping("/user")
    public String userWelcome(){
        return "Hello User, Thanks for your precious time!!! " +
                "Hope you liked this website";
    }

    @GetMapping("/admin")
    public String adminWelcome(){
        return "Hey Admin.. Welcome 😊";
    }
}
