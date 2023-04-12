package com.example.SchoolBus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class map_controller {
    @GetMapping("/map")
    public String mapaction (){
        return "map_main";
    }
}
