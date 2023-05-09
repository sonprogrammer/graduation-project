package com.example.SchoolBus.controller;

import com.example.SchoolBus.Weather_Crawling.Weather_cra;
import com.example.SchoolBus.Weather_Crawling.Weather_obj;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class Weather_controller {
//    private final Weather_cra weatherCra;
//
//    public Weather_controller(Weather_cra weatherCra) {
//        this.weatherCra = weatherCra;
//    }

    @GetMapping("/timetable")
    public String timetable(Model model) throws IOException {

        Weather_obj weatherCra1 = new Weather_obj();
        double rainfall = weatherCra1.getRainfall();
        String weather = weatherCra1.getWeather();


        model.addAttribute("rainfall", rainfall);
        model.addAttribute("weather", weather);

        return "timetable";
    }
}
