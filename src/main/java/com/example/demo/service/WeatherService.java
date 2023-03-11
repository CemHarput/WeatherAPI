package com.example.demo.service;

import com.example.demo.dto.CityDto;
import com.example.demo.dto.converter.CityDtoConverter;
import com.example.demo.model.City;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private final RestTemplate restTemplate;
    private final CityDtoConverter cityDtoConverter;
    public WeatherService(RestTemplate restTemplate, CityDtoConverter cityDtoConverter) {
        this.restTemplate = restTemplate;
        this.cityDtoConverter = cityDtoConverter;
    }
    public CityDto getCityDto(){
        City city = restTemplate.getForObject("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/London,UK/2020-12-15T13:00:00?key=AKW5AX4MWUR6M5P9YPEQA9EQG&include=current",City.class);

        return CityDtoConverter.convert(city);
    }
}
