package com.example.srpingboottest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class controller {
    @RequestMapping("/demon")
    public String demon(){
        return "demon";
    }
}
