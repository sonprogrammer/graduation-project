package com.example.SchoolBus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class web_push_controller {
    @GetMapping("/Web_Push")
    public String web_push(){
        return "Web_Push";
    }

}
