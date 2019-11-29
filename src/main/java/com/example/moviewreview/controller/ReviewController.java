package com.example.moviewreview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello World";
    }
}
