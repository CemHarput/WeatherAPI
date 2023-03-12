package com.example.demo.service;

import com.example.demo.dto.CityDto;
import com.example.demo.dto.converter.CityDtoConverter;
import com.example.demo.model.City;
import com.example.demo.model.CurrentCondition;
import com.example.demo.model.Day;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public City getCity(){
        String jsonString = restTemplate.getForObject("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/London,UK/2020-12-15T13:00:00?key=AKW5AX4MWUR6M5P9YPEQA9EQG&include=current",String.class);
        return new Gson().fromJson(jsonString,City.class);
    }

}
