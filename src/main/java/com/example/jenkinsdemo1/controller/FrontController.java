package com.example.jenkinsdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FrontController {

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "updated home page";
    }
}
