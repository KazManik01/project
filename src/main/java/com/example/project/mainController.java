package com.example.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class mainController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/mainPage")
    public String mainPage(){
        return "mainPage";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }


}
