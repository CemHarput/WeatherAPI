package com.example.demo.controller;

import com.example.demo.dto.pojo.CityDTO;
import com.example.demo.model.City;
import com.example.demo.service.WeatherService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Operation(tags = "Weather Controller")
    @GetMapping("/test")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @Operation(tags = "Weather Controller")
    @GetMapping("/{city}")
    public ResponseEntity<CityDTO> getCity(@PathVariable String city) {
         return ResponseEntity.ok(weatherService.saveCity(city));
    }
    @Operation(tags = "Weather Controller")
    @GetMapping("/getAllCities")
    public ResponseEntity<List<CityDTO>> getAllCities(){
        return ResponseEntity.ok(weatherService.getAllCities());
    }


}
