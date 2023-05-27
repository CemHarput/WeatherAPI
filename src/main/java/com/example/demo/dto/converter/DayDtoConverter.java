package com.example.demo.dto.converter;

import com.example.demo.dto.pojo.DayDTO;
import com.example.demo.model.Day;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DayDtoConverter {
    public static DayDTO convert(Day from) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(from, DayDTO.class);
    }
}
