package com.example.demo.dto.converter;

import com.example.demo.dto.CurrentConditionDto;
import com.example.demo.dto.DayDto;
import com.example.demo.dto.StationDto;
import com.example.demo.model.CurrentCondition;
import com.example.demo.model.Day;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CurrentConditionDtoConverter {
    public static CurrentConditionDto convert(CurrentCondition from) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(from, CurrentConditionDto.class);
    }
}
