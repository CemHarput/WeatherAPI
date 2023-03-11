package com.example.demo.dto

import java.math.BigDecimal

data class StationEntityDto(

    val stationId: String?,
    val distance: BigDecimal?,
    val latitude: BigDecimal?,
    val longitude: BigDecimal?,
    val useCount:Int?,
    val id:String?,
    val name:String?,
    val quality:Int?,
    val contribution: BigDecimal?,
)
