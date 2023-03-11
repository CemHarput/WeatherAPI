package com.example.demo.dto


import java.math.BigDecimal
import java.time.LocalTime

data class CurrentConditionDto(
    val id: String?,
    val datetime: LocalTime?,
    val datetimeEpoch:Long?,
    val temp: BigDecimal?,
    val feelslike: BigDecimal?,
    val humidity: BigDecimal?,
    val dew: BigDecimal?,
    val precip: BigDecimal?,
    val precipprob: BigDecimal?,
    val snow: BigDecimal?,
    val snowdepth: BigDecimal?,
    val preciptype: BigDecimal?,
    val windgust: BigDecimal?,
    val windspeed: BigDecimal?,
    val winddir: BigDecimal?,
    val pressure: BigDecimal?,
    val visibility: BigDecimal?,
    val cloudcover: BigDecimal?,
    val solarradiation: BigDecimal?,
    val solarenergy: BigDecimal?,
    val uvindex: BigDecimal?,
    val conditions:String?,
    val icon:String?,
    val stationEntities: Set<StationEntityDto>,
    val source:String?,
    val sunrise:String?,
    val sunriseEpoch:Long?,
    val sunset:String?,
    val sunsetEpoch:Long?,
    val moonphase: BigDecimal?,
)
