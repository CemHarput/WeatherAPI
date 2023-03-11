package com.example.demo.dto.converter;

import com.example.demo.dto.StationDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StationDtoConverter {
    public static StationDto convert(StationDto from) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(from, StationDto.class);
    }
}
