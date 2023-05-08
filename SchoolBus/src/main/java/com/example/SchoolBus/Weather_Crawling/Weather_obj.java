package com.example.SchoolBus.Weather_Crawling;

import lombok.*;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Getter
public class Weather_obj {

    private String weather; // 날씨(맑음, 비, 눈 등등)

    private int rainfall; // 강수량

    private String img; // 날씨 이미지

    public static class Builder {
        private String weather; // 날씨(맑음, 비, 눈 등등)

        private int rainfall; // 강수량

        private String img; // 날씨 이미지

        public int getRainfall(){
            return rainfall;
        }

        public String getWeather(){
            return weather;
        }

        public Builder weather(String weather) {
            this.weather = weather;
            return this;
        }

        public Builder rainfall(int rainfall ) {
            this.rainfall = rainfall;
            return this;
        }

        public Builder img(String img) {
            this.img = img;
            return this;
        }

        public Weather_obj build() {
            return new Weather_obj(weather, rainfall, img);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}