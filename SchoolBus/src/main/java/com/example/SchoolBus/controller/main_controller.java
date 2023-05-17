package com.example.SchoolBus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class main_controller {
  @GetMapping("/")
    public String main(){
      return "mainpage";
    }

  @GetMapping("/board")
  public String board(){
    return "board";
  }
}
