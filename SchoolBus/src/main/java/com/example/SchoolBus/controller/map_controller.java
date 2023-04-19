package com.example.SchoolBus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class map_controller {
    @GetMapping("/map_manager")
    public String mapaction (){
        return "map_manager_test";
    }
    @GetMapping("/map_user")
    public String mapaction2 (){
        return "map_user";
    }
}
