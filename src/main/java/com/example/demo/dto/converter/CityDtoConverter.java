package com.example.demo.dto.converter;

import com.example.demo.dto.CityDto;
import com.example.demo.model.City;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CityDtoConverter {
    public static CityDto convert(City from) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(from, CityDto.class);
    }

}

