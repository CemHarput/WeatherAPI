package com.example.demo.dto

import com.example.demo.model.StationEntity
import org.hibernate.annotations.GenericGenerator

data class StationDto(
    val id: String?,
    val stationEntities: Set<StationEntityDto>,
)
