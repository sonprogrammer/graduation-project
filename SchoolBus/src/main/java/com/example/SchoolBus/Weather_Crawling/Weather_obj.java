package com.example.SchoolBus.Weather_Crawling;

import lombok.*;

@Setter
@NoArgsConstructor
@ToString
@Builder
@Getter
public class Weather_obj {
    public Weather_obj(String weather, double rainfall) {
        this.weather = weather;
        this.rainfall = rainfall;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
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
