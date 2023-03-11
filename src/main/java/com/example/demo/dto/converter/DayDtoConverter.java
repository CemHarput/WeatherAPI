package com.example.demo.dto.converter;

import com.example.demo.dto.DayDto;
import com.example.demo.model.Day;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DayDtoConverter {
    public static DayDto convert(Day from) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(from, DayDto.class);
    }
}
