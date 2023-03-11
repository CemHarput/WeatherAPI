package com.example.demo.model

import javax.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
data class Station(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?,

    val stationName:String?,

    @OneToMany(mappedBy = "station", fetch = FetchType.LAZY)
    val stationEntities: Set<StationEntity>,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    val city: City,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "current_condition_id")
    val currentCondition: CurrentCondition,

    ){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Station

        if (id != other.id) return false
        if (stationEntities != other.stationEntities) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + stationEntities.hashCode()
        return result
    }
}

