package com.example.SchoolBus.Weather_Crawling;

import lombok.*;

@Setter
@NoArgsConstructor
@ToString
@Getter
public class Weather_obj {
    public Weather_obj(String weather, double rainfall, String test1, double test2) {
        this.weather = weather;
        this.test2 = test2;
        this.test1 = test1;
        this.rainfall = rainfall;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }

    public String test1;
    public double test2;

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public double getTest2() {
        return test2;
    }

    public void setTest2(double test2) {
        this.test2 = test2;
    }

    public String weather; // 날씨(맑음, 비, 눈 등등)

    public double rainfall; // 강수량

    public double getRainfall(){
        return rainfall;
    }
    public String getWeather(){
        return weather;
    }
}
