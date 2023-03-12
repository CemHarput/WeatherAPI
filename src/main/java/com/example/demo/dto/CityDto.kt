package com.example.demo.dto

import lombok.Data
import java.math.BigDecimal

data class CityDto(
    val id: String?,
    val queryCost:Int?,
    val latitude:BigDecimal?,
    val longitude:BigDecimal?,
    val resolvedAddress:String?,
    val address:String?,
    val timezone:String?,
    val tzoffset:BigDecimal?,
    val days: List<DayDto>,
    val currentCondition: CurrentConditionDto,
)
