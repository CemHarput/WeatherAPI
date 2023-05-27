package com.example.demo.dto.converter;

import com.example.demo.dto.pojo.CityDTO;
import com.example.demo.model.City;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityDtoConverter {
    public CityDTO convert(City from) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(from, CityDTO.class);
    }
}

