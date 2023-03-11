package com.example.demo.dto.converter;

import com.example.demo.dto.StationEntityDto;
import com.example.demo.model.StationEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StationEntityConverter {
    public static StationEntityDto convert(StationEntity from) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(from, StationEntityDto.class);
    }
}
