package com.example.SchoolBus.Weather_Crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



@Service
public class Weather_cra {
    private static String NAVER_Weather_URL = "https://weather.naver.com/today/";

    public Weather_obj getWeatherData() throws IOException {

        Document doc = Jsoup.connect(NAVER_Weather_URL).get();
        Elements contents = doc.select(".summary .weather");
        String weather = contents.text();
        Document doc2 = Jsoup.connect("https://search.naver.com/search.naver?query=서산+날씨&nso=&where=nexearch&sm=tab_etc&tab_bar=1&ie=utf8&start=0").get();
        Elements rainfall = doc2.select(".rainfall");
        Elements get_temperature = doc2.select("._today .weather_graphic .temperature_text");
        String temperature = get_temperature.text().replaceAll("[^0-9.]", "");;
        String rainfallInfo = rainfall.get(0).text();
//        System.out.println(rainfallInfo);             //테스트용 출력

        String text = rainfallInfo;

        Pattern pattern = Pattern.compile("강수량\\s*(\\d+)"); // 정규표현식
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            String rainfallinfo = matcher.group(1); // 첫 번째 그룹(괄호로 감싼 부분)의 값을 가져온다
            System.out.println("강수량: " + rainfallinfo + "\n" + weather + "\n" + temperature); //출력 테스트
        }

        String rainfallinfo = matcher.group(1);

        double rainfall_data = Double.parseDouble(rainfallinfo);

        double time_set = 3.7828497886657715 * rainfall_data - 3.9854519367218018; // 딥러닝 식 가져와서 수정
        double time = Math.round(time_set * 10) / 10.0;
        Weather_obj weather_data = new Weather_obj();
        weather_data.weather = weather;
        weather_data.rainfall = rainfall_data;
        weather_data.time = time + 1.4;
        weather_data.temperature = temperature;


//        System.out.println(weather + rainfall_data);
//        System.out.println(weather_data.rainfall + weather_data.weather);
        return weather_data;
    }
}
