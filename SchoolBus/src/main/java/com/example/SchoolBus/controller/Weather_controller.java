package com.example.SchoolBus.controller;

import com.example.SchoolBus.Weather_Crawling.Weather_cra;
import com.example.SchoolBus.Weather_Crawling.Weather_obj;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.io.IOException;
@RequiredArgsConstructor
@Controller
public class Weather_controller {
    private final Weather_cra weatherCra1;

    @GetMapping("/timetable")
    public String timetable(Model model) throws IOException {

        Weather_obj weatherCra1 = new Weather_obj();
        double rainfall = weatherCra1.getRainfall();
        String weather = weatherCra1.getWeather();
        double  test2 = weatherCra1.getTest2();
        String test1 = weatherCra1.getTest1();


        model.addAttribute("rainfall", weatherCra1.getRainfall());
        model.addAttribute("weather", weatherCra1.getWeather());
        model.addAttribute("test1", test1);
        model.addAttribute("test2", test2);

        return "timetable";
    }
}
