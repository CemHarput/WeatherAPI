package com.example.demo.service;


import com.example.demo.dto.converter.CityDtoConverter;
import com.example.demo.dto.pojo.CityDTO;
import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class WeatherService {
    private final RestTemplate restTemplate;
    private final CityRepository cityRepository;
    private final CityDtoConverter cityDtoConverter;


    public WeatherService(RestTemplate restTemplate, CityRepository cityRepository, CityDtoConverter cityDtoConverter) {
        this.restTemplate = restTemplate;
        this.cityRepository = cityRepository;
        this.cityDtoConverter = cityDtoConverter;
    }
    public City getCity(String cityName) {
        Map<String, String> cityNameParam = Collections.singletonMap("cityName", cityName);

        String url = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/{cityName}?unitGroup=metric&include=current&key=AKW5AX4MWUR6M5P9YPEQA9EQG&contentType=json";
        String jsonString = restTemplate.getForObject(url, String.class,cityNameParam);
        return new Gson().fromJson(jsonString, City.class);
    }
    public CityDTO saveCity(String cityName) {
        City city = getCity(cityName);
        return cityDtoConverter.convert(cityRepository.save(city));

    }
    public List<CityDTO> getAllCities() {
        return cityRepository.findAll().stream().map(cityDtoConverter::convert).collect(Collectors.toList());
    }
}
