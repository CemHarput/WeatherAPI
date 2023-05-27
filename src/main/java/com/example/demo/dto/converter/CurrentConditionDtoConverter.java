package com.example.demo.dto.converter;

import com.example.demo.dto.pojo.CurrentConditionDTO;
import com.example.demo.model.CurrentCondition;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CurrentConditionDtoConverter {
    public static CurrentConditionDTO convert(CurrentCondition from) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(from, CurrentConditionDTO.class);
    }
}
