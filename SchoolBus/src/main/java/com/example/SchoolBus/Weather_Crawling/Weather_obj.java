package com.example.SchoolBus.Weather_Crawling;

import lombok.*;

@Setter
@NoArgsConstructor
@ToString
@Getter
public class Weather_obj {
    public Weather_obj(String weather, double rainfall, double time, String temperature) {
        this.weather = weather;
        this.rainfall = rainfall;
        this.time = time;
        this.temperature = temperature;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }


    public String weather; // 날씨(맑음, 비, 눈 등등)

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double time; //예상 지연시간

    public double rainfall; // 강수량



     public String temperature;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public double getRainfall(){
        return rainfall;
    }
    public String getWeather(){
        return weather;
    }
}
