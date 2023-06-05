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
    private final Weather_cra weatherCra;

    @GetMapping("/timetable")
    public String timetable(Model model) throws IOException {
        weatherCra.getWeatherData();
        Weather_obj weatherData = weatherCra.getWeatherData();

        double rainfall = weatherData.getRainfall();
        String weather = weatherData.getWeather();
        double time = weatherData.getTime();
        String temp = weatherData.getTemperature();

        model.addAttribute("rainfall", rainfall);
        model.addAttribute("weather", weather);
        model.addAttribute("time", time);
        model.addAttribute("temp", temp);

        return "timetable";
    }
    @GetMapping("/board")
    public String board(Model model) throws IOException {
        weatherCra.getWeatherData();
        Weather_obj weatherData = weatherCra.getWeatherData();

        double rainfall = weatherData.getRainfall();
        String weather = weatherData.getWeather();
        double time = weatherData.getTime();
        String temp = weatherData.getTemperature();

        model.addAttribute("rainfall", rainfall);
        model.addAttribute("weather", weather);
        model.addAttribute("time", time);
        model.addAttribute("temp", temp);

        return "board";
    }
}